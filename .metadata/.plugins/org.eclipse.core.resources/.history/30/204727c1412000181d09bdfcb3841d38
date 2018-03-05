package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AdminDAO;
import com.internousdev.ecsite.dao.ItemDAO;
import com.internousdev.ecsite.dto.AdminDTO;
import com.internousdev.ecsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport implements SessionAware{



	private String adminId;
	private String adminPass;
	private String result;
	public Map<String,Object> session;
	private AdminDAO adminDAO = new AdminDAO();
	private AdminDTO adminDTO = new AdminDTO();
	private ItemDAO itemDAO = new ItemDAO();

	public String execute(){
		result = ERROR;

		adminDTO = adminDAO.getAdminUser(adminId, adminPass);

		session.put("adminUser",adminDTO);



	if(((AdminDTO)session.get("adminUser")).getAdminFlg()){
		result = SUCCESS;
		ItemDTO itemDTO = itemDAO.getItemInfo();
		session.put("admin_id",adminDTO.getAdminId());
		session.put("id",itemDTO.getId());
		session.put("Item_name",itemDTO.getItemName());
		session.put("Item_price", itemDTO.getItemPrice());

		return result;
	}

	return result;
	}

	public String getAdminId(){
		return adminId;
	}

	public void setAdminId(String adminId){
		this.adminId = adminId;
	}

	public String getAdminPass(){
		return adminPass;
	}

	public void setAdminPass(String adminPass){
		this.adminPass = adminPass;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ

		this.session = session;

	}



}
