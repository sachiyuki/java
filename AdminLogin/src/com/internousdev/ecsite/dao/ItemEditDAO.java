package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemEditDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemEditDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private ArrayList<ItemEditDTO> itemNewList = new ArrayList<ItemEditDTO>();

	public ArrayList<ItemEditDTO> getItemNewInfo(String itemId, String newName, String newPrice, String newStock){


		String sql = "update item_info_transaction set item_name = ?, item_price = ?, item_stock = ? where id = ?";

		try{
			ItemEditDTO itemEditDTO = new ItemEditDTO();

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, newName);
			preparedStatement.setString(2, newPrice);
			preparedStatement.setString(3, newStock);
			preparedStatement.setString(4, itemId);

			itemNewList.add(itemEditDTO);
		}

		catch(Exception e){
			e.printStackTrace();
		}
		return itemNewList;
	}

}
