package com.dzpay.admin.common.dao;

import org.springframework.stereotype.Repository;

import com.dzpay.admin.model.skypg.TblofficeAdmin;


@Repository("officeAdminDao")
public class OfficeAdminDao extends AbstractDAO{
	
	public TblofficeAdmin selectOfficeAdmin(String adminCompId) throws Exception{
		TblofficeAdmin res = (TblofficeAdmin) selectOne("TblofficeAdminMapper_SQL.selectOne", adminCompId);
		if(res == null) {
			return null;
		}
		return res;
	}
	
	public boolean insertOfficeAdmin(TblofficeAdmin vo) throws Exception{
		int res = (int) insert("TblofficeAdminMapper_SQL.insert", vo);
		if(res != 1) {
			return false;
		}
		return true;
	}
	
}
