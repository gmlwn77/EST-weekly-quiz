package dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class main {
	public static void main(String[] args){
		DBConn dbConn = new DBConn();

		Scanner scanner = new Scanner(System.in);
		System.out.println("query");
		String query = scanner.nextLine();

		try{
			dbConn.dbConnection();
			PreparedStatement pstmt = dbConn.dbconn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			dbConn.select(rs);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			dbConn.dbClose();
		}

	}
}
