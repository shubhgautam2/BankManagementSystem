package app01_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from emp1");) {
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-----------------------------");
			while (rs.next()) {
				System.out.print(rs.getInt("ENO") + "\t");
				System.out.print(rs.getString("ENAME") + "\t");
				System.out.print(rs.getFloat("ESAL") + "\t");
				System.out.print(rs.getString("EADDR") + "\n");
			} // Loop End
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
