import java.sql.*;
public class UPDATEMULTPLE {
public static void main(String[] args) {
	Connection conn=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");   
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","RAJKIRAN","Raj@1996");  //connect to database//
			Statement st = conn.createStatement(); 
			st.executeUpdate("UPDATE officials  SET dept='hr' WHERE username='gopal'");
			st.executeUpdate("UPDATE admin      SET email='srikant@gmail.com' WHERE username='srikant'");
			st.executeUpdate("UPDATE users      SET username='tirupati23' WHERE username='tirupati'");
			st.executeUpdate("UPDATE users      SET email='vijay@gmail.com' WHERE username='vijay'");

	
			conn.close();
	}
	catch (Exception e)
	{
		System.err.println("got an Exception!");
	}
}
}