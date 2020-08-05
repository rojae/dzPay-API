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
		logger.info("------- ������ ��û ��� : " + admId + "-----");

		if (applyRegistDao.insertApplyRegist(vo)) {
			logger.info("------- ���� : ������ ��û ��Ͽ� �����Ͽ����ϴ� ----------");
			return true;
		}
		logger.info("------- ���� : �����ͺ��̽� ��Ͽ� �����Ͽ����ϴ�  ----------");
		return false;
	}

}
