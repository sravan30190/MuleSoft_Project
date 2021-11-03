package mulesoft1.intern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

	public static Connection connect() {

		String jdbcurl="jdbc:sqlite:/C:\\sqlite\\db\\users.db";
		Connection con=null;
		try
		{
		con =DriverManager.getConnection(jdbcurl);
		}
		catch(SQLException e)
		{
			System.out.println("Error in Connection");
			e.printStackTrace();
		}
		return con;

}
	
}
