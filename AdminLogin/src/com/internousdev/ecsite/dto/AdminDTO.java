package com.internousdev.ecsite.dto;

public class AdminDTO {

	private String adminId;
	private String adminPass;
	private boolean adminFlg = false;


	public boolean getAdminFlg() {
		// TODO 自動生成されたメソッド・スタブ
		return adminFlg;
	}

	public String getAdminId() {
		// TODO 自動生成されたメソッド・スタブ
		return adminId;
	}

	public void setAdminId(String adminId) {
		// TODO 自動生成されたメソッド・スタブ
		this.adminId = adminId;
	}

	public void setAdminPass(String adminPass) {
		// TODO 自動生成されたメソッド・スタブ
		this.adminPass = adminPass;
	}

	public String getAdminPass(){
		return adminPass;
	}

	public void setAdminFlg(boolean adminFlg) {
		// TODO 自動生成されたメソッド・スタブ
		this.adminFlg = adminFlg;
	}


}
