package com.dzpay.admin.common.token.service;

import java.net.URL;

import javax.annotation.Resource;
import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.dzpay.admin.common.dto.token.auth.BINCheckModel;
import com.dzpay.admin.common.dto.token.auth.BINCheckResult;
import com.dzpay.admin.common.dto.token.auth.VCNTCheckModel;
import com.dzpay.admin.common.dto.token.auth.VCNTCheckResult;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Service(value = "pgService")
public class PgService {

	@Resource(name = "jwtService")
	private JwtService jwtService;

	public BINCheckResult binCheck() {
		BINCheckModel bin = new BINCheckModel();
		BINCheckResult result = new BINCheckResult();

		try {
			QName serviceName = new QName("http://testapi.duzonpay.com/", "DuzonPayWebService");
			URL wsdlURL = DuzonPayWebService.WSDL_LOCATION;

			DuzonPayWebService ds = new DuzonPayWebService(wsdlURL, serviceName);
			APIWebservice port = ds.getAPIWebserviceImplPort();

			bin.setApikey("apikey1234567890123456789165156166551");
			bin.setSitecd("P0063");
			//bin.setCardno(jwtService.getCardno());
			result = port.BINCheckService(bin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public VCNTCheckResult vcntCheck() {
		VCNTCheckModel vcnt = new VCNTCheckModel();
		VCNTCheckResult result = new VCNTCheckResult();

		try {
			QName serviceName = new QName("http://testapi.duzonpay.com/", "DuzonPayWebService");
			URL wsdlURL = DuzonPayWebService.WSDL_LOCATION;

			DuzonPayWebService ds = new DuzonPayWebService(wsdlURL, serviceName);
			APIWebservice port = ds.getAPIWebserviceImplPort();

			vcnt.setApikey("apikey1234567890123456789165156166551");
			vcnt.setSitecd("P0063");
			//vcnt.setVTradeNo(jwtService.getVTradeNo());
			//vcnt.setAccountNo(jwtService.getAccountNo());
			result = port.VCNTCheckService(vcnt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

