package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	// DB Driver
	String dbDriver = "com.mysql.cj.jdbc.Driver";

	// DB URL
	// IP:PORT/스키마
	String dbUrl = "jdbc:mysql://127.0.0.1:3306/test_db";

	// DB ID/PW
	String dbUser = "root";
	String dbPassword = "0000";


	Connection dbconn = null;


	public void dbConnection()
	{
		Connection connection = null;

		try
		{
			Class.forName(dbDriver);
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			dbconn = connection;

			System.out.println("DB Connection [성공]");
		}
		catch (SQLException e)
		{
			System.out.println("DB Connection [실패]");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("DB Connection [실패]");
			e.printStackTrace();
		}
	}

	public void dbClose()
	{
		try
		{
			if(dbconn != null)
			{
				dbconn.close();
				dbconn = null;
				System.out.println("DB Close [성공]");
			}
		}
		catch (SQLException e)
		{
			System.out.println("DB Close [실패]");
			e.printStackTrace();
		}
	}

	public void select(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.println("name: " + rs.getString("name"));
			System.out.println("age: " + rs.getInt("age"));
			System.out.println("address: " + rs.getString("address"));
		}
	}
}
