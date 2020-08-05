package com.dzpay.admin.common.dto.token.auth;


import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {
	
	private Long id;
	
	private String apikey;
	
	private String sitecd;
	
	private Date createdDate;
	
	public UserDto () {
		
	}
	

	public UserDto(Long id, String apikey, String sitecd, Date createdDate){
		this.id = id;
		this.apikey = apikey;
		this.sitecd = sitecd;
		this.createdDate = new Date();
	}


	public boolean isFull() {
		if(!this.getId().equals(null) && !this.getSitecd().equals(null) && !this.getApikey().equals(null) && !this.getCreatedDate().equals(null))
			return true;
		else
			return false;
	}

}
