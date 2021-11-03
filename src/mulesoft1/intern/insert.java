package mulesoft1.intern;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
   public static void Insert(Connection con,String name,String actor,String actress,String director,String year)
    {
     PreparedStatement ps=null;
     try
     {
       String sql="Insert into Movies(name,actor,actress,director,year) VALUES(?,?,?,?,?)";
       ps=con.prepareStatement(sql);
       ps.setString(1,name.toUpperCase());
       ps.setString(2,actor.toUpperCase());
       ps.setString(3,actress.toUpperCase());
       ps.setString(4,director.toUpperCase());
       ps.setString(5,year);
       ps.execute();
      System.out.println("Record Inserted Successfully"); 
     }
     catch(SQLException e)
     {
       System.out.println(e);
     }
    }
   
}