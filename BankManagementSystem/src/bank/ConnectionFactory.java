package bank;

import java.sql.*;
public class ConnectionFactory {
	//instance variable
	Connection con;
	Statement stmt;
	public ConnectionFactory(){
		try {
			//to load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement","root","mysql");
			stmt=con.createStatement();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
