package com.dzpay.admin.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	}

}
