package mavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Updatestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = null;
			c = DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "inba");
			String str = "Update emp1 set firstname=?, lastname=?, age=? where eid=?";
			PreparedStatement ps = c.prepareStatement(str);
			ps.setString(1, "RAVENA");
			ps.setString(2, "DEJU");
			ps.setInt(3, 25);
			ps.setInt(4,1);
			int i=ps.executeUpdate();
			System.out.println(i+"Record Updated successfully..");
			c.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		}
	}


