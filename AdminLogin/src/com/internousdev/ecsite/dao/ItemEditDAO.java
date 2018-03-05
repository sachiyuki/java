package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemEditDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "update item_info_transaction set item_name = ?, item_price = ?, item_stock = ? where id = ?";

	public void editItem(String itemId, String newName, String newPrice, String newStock) throws SQLException{

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, newName);
			preparedStatement.setString(2, newPrice);
			preparedStatement.setString(3, newStock);
			preparedStatement.setString(4, itemId);

			preparedStatement.execute();
		}

		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
	}

}
