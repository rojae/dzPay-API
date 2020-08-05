package com.dzpay.admin.controller.sample;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dzpay.admin.common.service.SampleService;

@Controller
public class SampleController {
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "sampleService")
	private SampleService sampleService;

	@RequestMapping(value = "/test.do")
	public ModelAndView openSampleBoardList(Map<String, Object> commandMap) throws Exception {
		log.debug("TEST");
		ModelAndView mv = new ModelAndView("/test/list");
		List<Map<String, Object>> list = sampleService.selectBoardList(commandMap);
		mv.addObject("list", list);
		return mv;
	}	

}
