import java.sql.*;  
class MySQL{  

public static void main(String args[]){  
try	{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/tektutor","root","root");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from Training");  
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		con.close();  
}
catch(Exception e){ System.out.println(e);}  
}  
} 
