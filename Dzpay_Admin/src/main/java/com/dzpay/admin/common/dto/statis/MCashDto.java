package com.dzpay.admin.common.dto.statis;

import com.dzpay.admin.common.error.UnsupportTypeException;

public class MCashDto {
	 
	private String fr_ymd;
	private String to_ymd;
	private String site_cd;
	private String comm_id;
	private String trade_status;
	private String search_kind;
	private String search_word;
	private String corp_id;
	private String shop_code;
	
	private String description;
	private String rtn_sts;
	
	
	public String getFr_ymd() {
		return fr_ymd;
	}
	public void setFr_ymd(String fr_ymd) {
		this.fr_ymd = fr_ymd;
	}
	public String getTo_ymd() {
		return to_ymd;
	}
	public void setTo_ymd(String to_ymd) {
		this.to_ymd = to_ymd;
	}
	public String getSite_cd() {
		return site_cd;
	}
	public void setSite_cd(String site_cd) {
		this.site_cd = site_cd;
	}
	public String getComm_id() {
		return comm_id;
	}
	public void setComm_id(String comm_id) {
		this.comm_id = comm_id;
	}
	public String getTrade_status() {
		return trade_status;
	}
	public void setTrade_status(String trade_status) {
		this.trade_status = trade_status;
	}
	public String getSearch_kind() {
		return search_kind;
	}
	public void setSearch_kind(String search_kind) {
		this.search_kind = search_kind;
	}
	public String getSearch_word() {
		return search_word;
	}
	public void setSearch_word(String search_word) {
		this.search_word = search_word;
	}
	public String getCorp_id() {
		return corp_id;
	}
	public void setCorp_id(String corp_id) {
		this.corp_id = corp_id;
	}
	public String getShop_code() {
		return shop_code;
	}
	public void setShop_code(String shop_code) {
		this.shop_code = shop_code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRtn_sts() {
		return rtn_sts;
	}
	public void setRtn_sts(String rtn_sts) {
		this.rtn_sts = rtn_sts;
	}
	
	/*
	 * daily Payment		dp
	 * daily Cancel			dc
	 *	month Payment		mp
	 *	month Cancel		mc
	 */
	public void convertColumn(String rtn_sts) throws Exception {
		
		if(this.rtn_sts.equals("")) {
			throw new UnsupportTypeException();
		}
		else if(this.rtn_sts.equals("dp")) {
			setDescription("MCash Today's Payments Amount for DuzonePay");
			setTrade_status("'ST01'");
		}
		else if(this.rtn_sts.equals("dc")) {
			setDescription("MCash Today's Cancellation Amount for DuzonePay");
			setTrade_status("'ST02'");
		}
		else if(this.rtn_sts.equals("mp")) {
			setDescription("MCash Month's Payments Amount for DuzonePay");
			setFr_ymd(getFr_ymd().substring(0, 6) + "01");
			setTrade_status("'ST01'");
		}
		else if(this.rtn_sts.equals("mc")) {
			setDescription("MCash Month's Cancellation Amount for DuzonePay");
			setFr_ymd(getFr_ymd().substring(0, 6) + "01");
			setTrade_status("'ST02'");
		}
		else
			throw new UnsupportTypeException();
	}

}
