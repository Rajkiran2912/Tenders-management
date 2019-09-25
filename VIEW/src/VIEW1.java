
import java.sql.*;

public class VIEW1 {

public static void main(String[] args) {
	Connection conn=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");   
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","RAJKIRAN","Raj@1996");  //connect to database//
			Statement st = conn.createStatement(); 
			st.executeUpdate("CREATE VIEW officialsdesig AS SELECT username FROM officials WHERE design='exe eng' ");
			conn.close();
	}
	catch (Exception e)
	{
		System.err.println("got an Exception!");
	}
}
}