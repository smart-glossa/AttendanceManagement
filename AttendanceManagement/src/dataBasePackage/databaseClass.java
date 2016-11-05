package dataBasePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseClass {
	public static String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static String MYSQL_PATH = "jdbc:mysql://" + System.getProperty("mysql.ipAddress") + ":3306/";
	public static String DATABASE_NAME = System.getProperty("Attendence.databaseName");
	public static String USERNAME = System.getProperty("mysql.username");
	public static String PASSWORD = System.getProperty("mysql.password");

	public static databaseClass getInstance() {
		return new databaseClass();
	}

	public Statement getCreatedStatement() throws ClassNotFoundException, SQLException {
		Class.forName(databaseClass.MYSQL_DRIVER);
		Connection connection = DriverManager.getConnection(databaseClass.MYSQL_PATH + databaseClass.DATABASE_NAME,
				databaseClass.USERNAME, databaseClass.PASSWORD);
		Statement statement = connection.createStatement();
		return statement;
	}
}
