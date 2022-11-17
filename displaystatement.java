
package mavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class displaystatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
       	 Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=null;
            
            conn= DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","inba");
            String str="select * from emp1 ";
            PreparedStatement ps = conn.prepareStatement(str);
            ps.setInt(1,25);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
            	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
            }
            conn.close();
        }
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
	}

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}