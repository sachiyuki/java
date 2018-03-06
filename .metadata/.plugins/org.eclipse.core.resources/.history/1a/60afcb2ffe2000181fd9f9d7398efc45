package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemActionDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();


	public ArrayList<ItemDTO> getItemInfo(){
		String sql="select * from item_info_transaction where id = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ItemDTO itemDTO = new ItemDTO();
				itemDTO.setId(resultSet.getString("id"));
				itemDTO.setItemName(resultSet.getString("item_name"));
				itemDTO.setItemPrice(resultSet.getString("item_price"));
				itemDTO.setItemStock(resultSet.getString("item_stock"));

				itemList.add(itemDTO);

			}
		} catch (Exception e){
			e.printStackTrace();
		}

		return itemList;
	}

}
