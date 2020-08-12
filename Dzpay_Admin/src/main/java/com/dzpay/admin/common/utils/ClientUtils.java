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
 
	// 사옹자 접속 IP
    public static String getRemoteIP(HttpServletRequest request){
         String ip = request.getHeader("X-FORWARDED-FOR"); 
         
         //proxy 환경일 경우
         if (ip == null || ip.length() == 0) {
             ip = request.getHeader("Proxy-Client-IP");
         }
 
         //웹로직 서버일 경우
         if (ip == null || ip.length() == 0) {
             ip = request.getHeader("WL-Proxy-Client-IP");
         }
 
         if (ip == null || ip.length() == 0) {
             ip = request.getRemoteAddr() ;
         }
         
         return ip;
    }

    // List 객채를 Json 객체로 변환 시켜주자
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