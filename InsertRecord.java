package mavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=null;
        conn= DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","inba");
        Statement stmt =conn.createStatement(); 
        System.out.println("inserting records to the table...");
        String sql ="INSERT INTO EMP1 VALUES(1,21,'RANVEER','N')";
        stmt.executeUpdate(sql);
        System.out.println("inserting records to the table...");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
