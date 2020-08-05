package com.dzpay.admin.common.error;

public class UnsameTokenException extends RuntimeException{
	
	private static final long serialVersionUID = -2399437919713761783L;

	public UnsameTokenException() {
		super("존재하지 않는 토큰");
	}
}
