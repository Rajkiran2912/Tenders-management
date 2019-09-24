




import java.sql.*;

public class UPDATERECORDS {



public static void main(String[] args) {
	Connection conn=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");   
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","RAJKIRAN","Raj@1996");  //connect to database//
			Statement st = conn.createStatement(); 
			st.executeUpdate("UPDATE officials  SET design='exe eng',mobileno='7998991234' WHERE username='pranay'");
	
			conn.close();
	}
	catch (Exception e)
	{
		System.err.println("got an Exception!");
	}
}
}