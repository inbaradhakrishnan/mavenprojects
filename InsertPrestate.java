package mavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrestate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
       	 Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=null;
            
            conn= DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","inba");
            String str="INSERT INTO EMP1(eid,age,firstname,lastname)values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(str);
            ps.setInt(1, 1);
            ps.setInt(2, 2);
            ps.setString(3, "Aari");
            ps.setString(4,"G");
            System.out.println("Record inserted successfully");
            ps.execute();
            conn.close();
     
        }
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
