package com.internousdev.ecsite.dto;

public class ItemEditDTO {

	public String id;
	public String newName;
	public String newPrice;
	public String newStock;
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



}
