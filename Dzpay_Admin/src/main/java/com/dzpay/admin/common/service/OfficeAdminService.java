package com.dzpay.admin.common.service;

import com.dzpay.admin.model.skypg.TblofficeAdmin;

public interface OfficeAdminService {
	TblofficeAdmin selectAdmin(String adminId) throws Exception;
	
	boolean insertAdmin(TblofficeAdmin vo) throws Exception;
	
}
