package com.dzpay.admin.common.dto.statis;

import com.dzpay.admin.common.error.UnsupportTypeException;

public class CardDto {
	private String fr_ymd;
	private String to_ymd;
	private String site_cd;
	private String corp_id;
	private String shop_code;
	private String trade_status;
	private String card_cd;
	private String quota_month;
	private String mob_yn;
	private String card_type;
	private String tax_yn;
	private String search_kind;
	private String search_word;
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
	public String getTrade_status() {
		return trade_status;
	}
	public void setTrade_status(String trade_status) {
		this.trade_status = trade_status;
	}
	public String getCard_cd() {
		return card_cd;
	}
	public void setCard_cd(String card_cd) {
		this.card_cd = card_cd;
	}
	public String getQuota_month() {
		return quota_month;
	}
	public void setQuota_month(String quota_month) {
		this.quota_month = quota_month;
	}
	public String getMob_yn() {
		return mob_yn;
	}
	public void setMob_yn(String mob_yn) {
		this.mob_yn = mob_yn;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public String getTax_yn() {
		return tax_yn;
	}
	public void setTax_yn(String tax_yn) {
		this.tax_yn = tax_yn;
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
	public void setRtn_sts(String rtn_sts) {
		this.rtn_sts = rtn_sts;
	}
	public String getRtn_sts() {
		return rtn_sts;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	/*
	 * daily Payment		dp
	 * daily Cancel			dc
	 *	month Payment		mp
	 *	month Cancel		mc
	 *	daily Meip			dm
	 *	daily Meip Cancel	dmc
	 */
	public void convertColumn(String rtn_sts) throws Exception {
		if(this.rtn_sts.equals("dp")) {
			setDescription("Card Today's Payments Amount for DuzonePay");
			setTrade_status("'ST01'");
		}
		else if(this.rtn_sts.equals("dc")) {
			setDescription("Card Today's Cancellation Amount for DuzonePay");
			setTrade_status("'ST02'");
		}
		else if(this.rtn_sts.equals("mp")) {
			setDescription("Card Month's Payments Amount for DuzonePay");
			setFr_ymd(getFr_ymd().substring(0, 6) + "01");
			setTrade_status("'ST01', 'ST20'");
		}
		else if(this.rtn_sts.equals("mc")) {
			setDescription("Card Month's Cancellation Amount for DuzonePay");
			setFr_ymd(getFr_ymd().substring(0, 6) + "01");
			setTrade_status("'ST02','ST30'");
		}
		else if(this.rtn_sts.equals("dm")) {
			setDescription("Card Today's Meip Amount for DuzonePay");
			setTrade_status("'ST20'");
		}
		else if(this.rtn_sts.equals("dmc")) {
			setDescription("Card Today's Meip Cancellation Amount for DuzonePay");
			setTrade_status("'ST30'");
		}
		else
			throw new UnsupportTypeException();
	}
	
}
