package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class ItemConfirmAction implements SessionAware{

	private String itemId;
	private String newName;
	private String newPrice;
	private String newStock;

	public Map<String,Object> session;

	private String result;
	private String errorMessage;

	public String execute() throws SQLException{


		String result = SUCCESS;

		return result;

	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
