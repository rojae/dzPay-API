package com.dzpay.admin.common.token.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "DuzonPayWebService", wsdlLocation = "https://testapi.duzonpay.com:8143/webservice/duzonpay?wsdl", targetNamespace = "http://testapi.duzonpay.com/")
public class DuzonPayWebService extends Service{
	public static final URL WSDL_LOCATION;
	public static final QName SERVICE = new QName("http://testapi.duzonpay.com/", "DuzonPayWebService");
	public static final QName APIWebserviceImplPort = new QName("http://testapi.duzonpay.com/", "APIWebserviceImplPort");
	
	static{
		URL url = null;
		
		try{
			url = new URL("https://testapi.duzonpay.com:8143/webservice/duzonpay?wsdl");
		}catch (MalformedURLException var2){
			Logger.getLogger(DuzonPayWebService.class.getName()).log(Level.INFO,
					"Can not initialize the default wsdl from {0}",
					"https://testapi.duzonpay.com:8143/webservice/duzonpay?wsdl");
		}
		WSDL_LOCATION = url;
	}
	public DuzonPayWebService(URL wsdlLocation){
		super(wsdlLocation, SERVICE);
	}
	public DuzonPayWebService(URL wsdlLocation, QName serviceName){
		super(wsdlLocation, serviceName);
	}
	public DuzonPayWebService(){
		super(WSDL_LOCATION, SERVICE);
	}
	
	@WebEndpoint(name = "APIWebserviceImplPort")
	public APIWebservice getAPIWebserviceImplPort(){
		return (APIWebservice) super.getPort(APIWebserviceImplPort, APIWebservice.class);
	}
	@WebEndpoint(name = "APIWebserviceImplPort")
	public APIWebservice getAPIWebserviceImplPort(WebServiceFeature... features){
		return (APIWebservice) super.getPort(APIWebserviceImplPort, APIWebservice.class, features);
	}
}
