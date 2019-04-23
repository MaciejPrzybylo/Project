package work.service;

import java.sql.SQLException;

public class dbTask extends dbConn {

	public static void createTask(int priority, String desc, int status, int listId) {
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			System.out.println("Exception at the begining");
			e1.printStackTrace();
		}
		
		String sql = "INSERT INTO `task` (`priority`,`desc`,`status`,`list_id`)"
				  + " VALUES ("+priority+",'"+desc+"',"+status+","+listId+")";
//for string variable '"+ uname + "'
//for primitive "+ variable +"		
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Exception at adding values");
			e.printStackTrace();
		}	
	}

	public static void updTaskStatus(int tId, int status) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "UPDATE `task` SET `status`="+ status+" WHERE `t_id`= "+ tId +"";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void rList(String tId) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "DELETE FROM `task` WHERE `t_id`=" + tId + "";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
