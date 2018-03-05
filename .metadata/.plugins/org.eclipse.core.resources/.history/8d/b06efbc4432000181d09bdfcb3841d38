package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.AdminDTO;
import com.internousdev.ecsite.util.DBConnector;



public class AdminDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection= dbConnector.getConnection();

	private AdminDTO adminDTO = new AdminDTO();


	public AdminDTO getAdminUser(String adminId, String adminPass) {

		String sql = "select * from admin_user2 where admin_id = ? and admin_pass = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, adminId);
			preparedStatement.setString(2, adminPass);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				adminDTO.setAdminId(resultSet.getString("admin_id"));
				adminDTO.setAdminPass(resultSet.getString("admin_pass"));

				if(!(resultSet.getString("admin_id").equals(null))){
					adminDTO.setAdminFlg(true);

				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}


		return adminDTO;
	}

}
