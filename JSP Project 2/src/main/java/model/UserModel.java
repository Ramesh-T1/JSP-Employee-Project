package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import resource.Users;

public class UserModel
{
	
	public static void add(Users nw/*,DataSource d*/)
	{
		Connection con=null;
		PreparedStatement stmt=null;
			try {
				/*con=d.getConnection();
				String usern=nw.getUsername();
				String em=nw.getEmail();
				System.out.println(usern);
				System.out.println(em);
				String query="insert into users (username,email) values (?,?)";
				stmt=con.prepareStatement(query);
				stmt.setString(1,usern);
				stmt.setString(2,em);
				stmt.executeUpdate();*/
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_project2","root","root@123");
				String usern=nw.getUsername();
				String em=nw.getEmail();
				//System.out.println(usern);
				//System.out.println(em);
				String query="insert into users (username,email) values (?,?)";
				stmt=con.prepareStatement(query);
				stmt.setString(1,usern);
				stmt.setString(2,em);
				stmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					stmt.close();
					con.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
	}
	public static List<Users> show()
	{
		List<Users> l=new ArrayList<>();
		Connection con1=null;
		PreparedStatement stmt1=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_project2","root","root@123");
		String query1="select * from users";
		stmt1=con1.prepareStatement(query1);
		ResultSet rs=stmt1.executeQuery();
		while(rs.next())
		{
			l.add(new Users(rs.getInt(0),rs.getString(1),rs.getString(2)));
		}
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
			 stmt1.close();
			 con1.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return l;
	}
}
