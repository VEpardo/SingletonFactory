package singleton;

import java.sql.*;

public class SingleConnection {
	
	private static SingleConnection connection = new SingleConnection();
	
	private SingleConnection() {}
	
	
	static {
		try {
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","TechTrain");
			System.out.println("Database Connected");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static SingleConnection getConnection() {
		return connection;
	}
	
}
