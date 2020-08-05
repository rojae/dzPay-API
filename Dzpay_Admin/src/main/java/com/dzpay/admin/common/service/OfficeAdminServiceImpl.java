package com.dzpay.admin.common.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dzpay.admin.common.dao.OfficeAdminDao;
import com.dzpay.admin.model.skypg.TblofficeAdmin;


@Service("officeAdminService")
public class OfficeAdminServiceImpl implements OfficeAdminService{
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "officeAdminDao")
	private OfficeAdminDao officeAdminDao;


	@Override
	public TblofficeAdmin selectAdmin(String admId) throws Exception {
		return officeAdminDao.selectOfficeAdmin(admId);
	}


	@Override
	public boolean insertAdmin(TblofficeAdmin vo) throws Exception {
		return officeAdminDao.insertOfficeAdmin(vo);
	}

}