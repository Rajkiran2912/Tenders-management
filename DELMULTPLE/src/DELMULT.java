import java.sql.*;
public class DELMULT {
public static void main(String[] args) {
	Connection conn=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");   //load driver//
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","RAJKIRAN","Raj@1996");  //connect to database//
			Statement st = conn.createStatement(); 
			st.executeUpdate("DELETE FROM users WHERE username='raju2912'");
			st.executeUpdate("DELETE FROM admin WHERE username='alex'");
			st.executeUpdate("DELETE FROM users WHERE email='sam@xyz.com'");
			st.executeUpdate("DELETE FROM officials WHERE dept='hr'");
	
			conn.close();
	}
	catch (Exception e)
	{
		System.err.println("got an Exception!");
	}
}
}