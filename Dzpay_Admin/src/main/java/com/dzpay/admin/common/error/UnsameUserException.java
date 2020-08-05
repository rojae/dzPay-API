package com.dzpay.admin.common.error;

public class UnsameUserException extends RuntimeException{

	private static final long serialVersionUID = 4215240651059951505L;

	public UnsameUserException() {
		super("존재하지 않는 유저");
	}
}
