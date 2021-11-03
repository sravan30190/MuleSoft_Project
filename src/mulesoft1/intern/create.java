package mulesoft1.intern;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class create {
	public static void table(Connection con )
	{
		try
		{
		String create = "create table Movies(name varchar(30),actor varchar(20) ,actress varchar(20) , director varchar(20) ,year varchar2(20))";
		Statement st=con.createStatement();
		st.executeUpdate(create);
		System.out.println("created");
		}
		catch(SQLException e)
		{
			System.out.println("Error in connection");
			e.printStackTrace();
		}
}
}
