package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;

public class ItemAction  extends ActionSupport{

	private String id = null;

	public String execute() {

		System.out.println("test");
		System.out.println(id);
		return SUCCESS;


	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



}
