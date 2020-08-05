package com.dzpay.admin.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.dzpay.admin.common.utils.ClientUtils;

public class LoggerInterceptor extends HandlerInterceptorAdapter {
	protected Logger log = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Qualifier("clinetUtils")
	ClientUtils clientUtils;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
			log.info("====================================== START ======================================");
			log.info(" Request URI \t: " + request.getRequestURI());
			log.info("IPv6 : " + ClientUtils.getRemoteIP(request));
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
			log.info("IPv6 : " + ClientUtils.getRemoteIP(request));
			log.info("====================================== END ======================================\n");
	}
}
