package com.dzpay.admin.common.error;

public class UnauthorizedException extends RuntimeException{

	private static final long serialVersionUID = 6043787107875836222L;

	public UnauthorizedException() {
		super("토큰 유효기간 만료.");
	}
}
