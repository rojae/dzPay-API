package com.dzpay.admin.common.dto.token.auth;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthDto {

	private Long id;

	private String apikey;

	private String sitecd;

	private String accessToken;

	private String refreshToken;

	private Date createdDate;

	private Date modifiedDate;

	public AuthDto() {

	}

	public AuthDto(Long id, String apikey, String sitecd, String accessToken, String refreshToken, Date createdDate,
			Date modifiedDate) {
		this.id = id;
		this.apikey = apikey;
		this.sitecd = sitecd;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.createdDate = new Date();
		this.modifiedDate = null;
	}

}

