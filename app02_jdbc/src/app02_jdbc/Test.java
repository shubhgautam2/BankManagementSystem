package app02_jdbc;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try (

				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from emp1");
				FileOutputStream fos = new FileOutputStream("E:/Gill.html");) {

			String data = "<html><body><table border='1' align='center'>";
			data = data + "<tr><th>ENO</th><th>ENAME</th><th>ESAL</th><th>EADDR</th></tr>";
			while (rs.next()) {
				data = data + "<tr>";
				data = data + "<td>" + rs.getInt("ENO") + "</td>";
				data = data + "<td>" + rs.getString("ENAME") + "</td>";
				data = data + "<td>" + rs.getFloat("ESAL") + "</td>";
				data = data + "<td>" + rs.getString("EADDR") + "</td>";
				data = data + "</tr>";
			}
			data = data + "</table></body></html>";
			byte[] b = data.getBytes();
			fos.write(b);
			System.out.println("Employee Data Send to E:/Gill.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
