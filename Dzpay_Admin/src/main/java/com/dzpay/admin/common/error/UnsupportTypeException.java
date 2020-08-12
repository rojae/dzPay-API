package com.dzpay.admin.common.error;

public class UnsupportTypeException extends RuntimeException{

	private static final long serialVersionUID = 6043787107875836222L;

	public UnsupportTypeException() {
		super("잘못된  API 호출");
	}
}
