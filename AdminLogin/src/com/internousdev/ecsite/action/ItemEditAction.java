package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemEditDAO;
import com.internousdev.ecsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemEditAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private ItemEditDAO itemEditDAO = new ItemEditDAO();
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}


}
