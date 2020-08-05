package com.dzpay.admin.common.token.service;

import java.util.logging.Logger;

import javax.jws.WebService;

import com.dzpay.admin.common.dto.token.auth.BINCheckModel;
import com.dzpay.admin.common.dto.token.auth.BINCheckResult;
import com.dzpay.admin.common.dto.token.auth.VCNTCheckModel;
import com.dzpay.admin.common.dto.token.auth.VCNTCheckResult;

@WebService(serviceName = "DuzonPayWebService", portName = "APIWebserviceImplPort", targetNamespace = "http://testapi.duzonpay.com/", wsdlLocation = "https://testapi.duzonpay.com:8143/webservice/duzonpay?wsdl", endpointInterface = "com.duzonpay.testapi.APIWebservice")
public class APIWebserviceImpl implements APIWebservice {
	private static final Logger LOG = Logger.getLogger(APIWebserviceImpl.class.getName());

	public BINCheckResult BINCheckService(BINCheckModel arg0) {
		LOG.info("Executing operation cardBINCheckService");
		System.out.println(arg0);

		try {
			BINCheckResult _return = new BINCheckResult();
			_return.setApikey("APIKEY-1805941134");
			_return.setCardcd("CARDCD-264150149");
			_return.setCardnm("CARDNM-620774587");
			_return.setCardno("CARDNO-2003320353");
			_return.setResultcode("RESULTCODE1004799915");
			_return.setResultmsg("RESULTMSG131442621");
			_return.setSitecd("SITECD-1955456417");
			return _return;
		} catch (Exception var3) {
			var3.printStackTrace();
			throw new RuntimeException(var3);
		}
	}

	@Override
	public VCNTCheckResult VCNTCheckService(VCNTCheckModel arg0) {
		// TODO Auto-generated method stub
		LOG.info("Executing operation VCNTCheckService");
		System.out.println(arg0);
		try{
			VCNTCheckResult _return = new VCNTCheckResult();
			_return.setAccountNo("ACCOUNTNO-1805941134");
			_return.setVTradeNo("VTRADENO-264150149");
			_return.setBankCd("BANKCD");
			_return.setTradeMony("TRADEMONY");
			_return.setRegDt("REGDT-620774587");
			_return.setExpiredDt("EXPIREDDT-1955456417");
			_return.setIpkumDate("IPKUMDATE-1805941134");
			_return.setCorpId("CORPID-264150149");
			_return.setAccountSts("ACCOUNTSTS-620774587");
			_return.setResultCode("RESULTCODE1004799915");
			_return.setResultMsg("RESULTMSG131442621");
			
			return _return;
			
		} catch (Exception var3) {
			var3.printStackTrace();
			throw new RuntimeException(var3);
		}
	}
}