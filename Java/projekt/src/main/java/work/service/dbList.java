package work.service;

import java.sql.SQLException;

public class dbList extends dbConn {
	
	
	public static void createList(String listName, int userId) {
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			System.out.println("Exception at the begining");
			e1.printStackTrace();
		}
		
		String sql = "INSERT INTO `list` (`list_name`,`u_id`)"
				  + " VALUES ('"+listName+"',"+userId+")";
//for string variable '"+ uname + "'
//for primitive "+ variable +"		
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Exception at adding values");
			e.printStackTrace();
		}
	
			
		
	}

	public static void updListName(String inputName, String listName) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "UPDATE `list` SET `list_name`='" + inputName + "' WHERE `list_name`= '"+ listName +"'";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void rList(String list) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "DELETE FROM `list` WHERE `list_name`='" + list + "'";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
