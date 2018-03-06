package com.internousdev.ecsite.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

public class ItemConfirmAction extends ActionSupport implements SessionAware{

	private String id;
	private String newName;
	private String newPrice;
	private String newStock;

	public Map<String,Object> session;

	private String result;
	private String errorMessage;

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

//	public String execute(){
//
//		 result = SUCCESS;
//
//			System.out.println("-----ItemConfirmAction-----");
//			System.out.println(id);
//			System.out.println(newName);
//			System.out.println(newPrice);
//			System.out.println(newStock);
//			System.out.println("--------------------------");
//			return result;
//
//	}


				private String sql = "update item_info_transaction set item_name = ?, item_price = ?, item_stock = ? where id = ?";

				public void itemEdit(String id, String newName, String newPrice, String newStock) throws SQLException{



				try{
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, newName);
					preparedStatement.setString(2, newPrice);
					preparedStatement.setString(3, newStock);
					preparedStatement.setString(4, id);

					preparedStatement.execute();

		 } catch (Exception e){
			 e.printStackTrace();
		 } finally {
			 connection.close();
		 }



	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getNewName() {
		return newName;
	}




	public void setNewName(String newName) {
		this.newName = newName;
	}




	public String getNewPrice() {
		return newPrice;
	}




	public void setNewPrice(String newPrice) {
		this.newPrice = newPrice;
	}




	public String getNewStock() {
		return newStock;
	}




	public void setNewStock(String newStock) {
		this.newStock = newStock;
	}




	public String getResult() {
		return result;
	}




	public void setResult(String result) {
		this.result = result;
	}




	public String getErrorMessage() {
		return errorMessage;
	}




	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}




	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
