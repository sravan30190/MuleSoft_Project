package mulesoft1.intern;
import java.sql.Connection;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
    int op;
    CreateDataBase.createNewDatabase("movie.db");
    Connection con=connection.connect();
    while(true)
    {
      System.out.println("Choose option");
      System.out.println("1. Insert data into Table");
      System.out.println("2. Query all the data");
      System.out.println("3.Query movie names based on actor name");
      op=sc.nextInt();
      switch(op)
      {
      case 1:
        System.out.println("Enter number of records to be inserted ");
        int n=sc.nextInt();
        String name,actor,actress,director,year;
        for(int i=0;i<n;i++)
        {
          System.out.println("Enter movie name");
             name=sc.next();
             System.out.println("Enter actor name");
             actor=sc.next();
             System.out.println("Enter actress name");
             actress=sc.next();
             System.out.println("Enter director name");
             director=sc.next();
             System.out.println("Enter year of release");
             year=sc.next();
             insert.Insert(con,name,actor,actress,director,year);
        }
        break;
      case 2:
        Query.queryAll(con);
        break;
      case 3:
        System.out.println("Enter name of actor to retrieve movies");
        String a=sc.next().toUpperCase();
        Query.querybyactor(con,a);
        break;
      default:
        op=4;
        break;
      }
      if(op==4)
      {
        break;
      }
    }
  }
}