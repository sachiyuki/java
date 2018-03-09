package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemEditDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemEditCompleteAction extends ActionSupport implements SessionAware {

	private String id;
	private String newName;
	private String newPrice;
	private String newStock;

	private String result;

	public Map<String, Object> session;

	private ItemEditDAO itemEditDAO = new ItemEditDAO();


	public String execute() throws SQLException{

		itemList = itemDAO.getItemInfo();

		result = SUCCESS;

		return result;
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
