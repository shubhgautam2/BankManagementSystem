package app03_jdbc;

import java.io.*;
import java.sql.*;

public class Test {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from emp1");
				FileOutputStream fos = new FileOutputStream("E:/emp.txt");) {
			String data = "ENO,ENAME,ESAL,EADDR\n";
			while (rs.next())
				
			{
				data = data + rs.getInt("ENO") + ",";
				data = data + rs.getString("ENAME") + ",";
				data = data + rs.getFloat("ESAL") + ",";
				data = data + rs.getString("EADDR") + "\n";
			}

			byte[] b = data.getBytes();
			fos.write(b);
			System.out.println("Employee details send to E:/emp.txt");

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}