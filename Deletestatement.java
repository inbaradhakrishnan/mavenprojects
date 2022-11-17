package mavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Deletestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = null;
			c = DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "inba");
			String str = "Delete from emp1 where eid =?";
			PreparedStatement ps = c.prepareStatement(str);
			ps.setInt(1,2);
			
			ps.execute();
			System.out.println("Record Deleted successfully..");
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
	

	}


	}

}
