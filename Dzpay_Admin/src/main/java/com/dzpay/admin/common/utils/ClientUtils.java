package com.dzpay.admin.common.utils;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.dzpay.admin.common.error.UnsupportTypeException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component(value="clientUtils")
public class ClientUtils {
 
	// ����� ���� IP
    public static String getRemoteIP(HttpServletRequest request){
         String ip = request.getHeader("X-FORWARDED-FOR"); 
         
         //proxy ȯ���� ���
         if (ip == null || ip.length() == 0) {
             ip = request.getHeader("Proxy-Client-IP");
         }
 
         //������ ������ ���
         if (ip == null || ip.length() == 0) {
             ip = request.getHeader("WL-Proxy-Client-IP");
         }
 
         if (ip == null || ip.length() == 0) {
             ip = request.getRemoteAddr() ;
         }
         
         return ip;
    }

    // List ��ä�� Json ��ü�� ��ȯ ��������
    public static String convertJsonObject(List<Map<String, Object>> list) {
    	ObjectMapper mapper = new ObjectMapper();
		String jsonStr;
		try {
			jsonStr = mapper.writeValueAsString(list);
			jsonStr = jsonStr.replaceAll("\\[", "");
			jsonStr = jsonStr.replaceAll("\\]", "");
			
			// more butty
			jsonStr = jsonStr.replaceAll("\\{", "{\n");
			jsonStr = jsonStr.replaceAll("\\}", "\n}");

			jsonStr = jsonStr.replaceAll(",", ",\n");
		} catch (JsonProcessingException e) {
			throw new UnsupportTypeException();
		}
		return jsonStr;
    }
}