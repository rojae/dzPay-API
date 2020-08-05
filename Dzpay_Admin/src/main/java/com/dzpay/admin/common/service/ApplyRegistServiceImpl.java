package com.dzpay.admin.common.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dzpay.admin.common.dao.ApplyRegistDao;
import com.dzpay.admin.model.skypg.TblapplyRegist;

@Service("applyRegistService")
public class ApplyRegistServiceImpl implements ApplyRegistService {

	private static final Logger logger = LoggerFactory.getLogger(ApplyRegistService.class);

	@Resource(name = "applyRegistDao")
	ApplyRegistDao applyRegistDao;

	@Override
	public boolean applyRegist(TblapplyRegist vo) throws Exception {
		String admId = vo.getContComments();
		logger.info("------- 가맹점 신청 등록 : " + admId + "-----");

		if (applyRegistDao.insertApplyRegist(vo)) {
			logger.info("------- 성공 : 가맹점 신청 등록에 성공하였습니다 ----------");
			return true;
		}
		logger.info("------- 실패 : 데이터베이스 등록에 실패하였습니다  ----------");
		return false;
	}

}
