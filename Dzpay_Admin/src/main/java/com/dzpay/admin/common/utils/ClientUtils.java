package com.dzpay.admin.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component(value="clientUtils")
public class ClientUtils {
 
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
}