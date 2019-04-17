package Project.projekt;

import java.sql.SQLException;

public class dbUser extends dbConn {

	public static void addAcc(String username, String pass, String email) {
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			System.out.println("Exception at the begining");
			e1.printStackTrace();
		}
		
		String sql = "INSERT INTO `user` (`username`, `pass`,`email`)"
				  + " VALUES ('"+ username + "','"+pass+"','"+email+"')";
//for string variable '"+ uname + "'
//for primitive "+ variable +"		
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Exception at adding values");
			e.printStackTrace();
		}
	
			
		
	}

	public static void updPass(String username, String pass) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "UPDATE `user` SET `pass`='" + pass + "' WHERE `username`= '"+ username +"'";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void rUsr(String username, String pass) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "DELETE FROM `user` WHERE `username`='" + username + "' AND `pass` = '" + pass + "'";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
