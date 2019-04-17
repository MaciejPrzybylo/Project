package Project.projekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class dbConn {
	
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:3306/projectdb";
		static final String USER = "root";
		static final String PASS = "admin";
		static Connection conn = null;
		static Statement stmt = null;
	 
		public static void accessDB() {
			
			try {
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
			

			} catch (SQLException e) {
				e.printStackTrace();
			
			}

		}

		public static void closeDb() {
			try {
				dbConn.conn.close();
			} catch (SQLException e) {
				System.out.println("nie moze zamknac");
				e.printStackTrace();
			}
		}

	
}
