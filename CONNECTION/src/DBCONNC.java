
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCONNC {

public static void main(String[] args)throws ClassNotFoundException, SQLException {
			
				Class.forName("oracle.jdbc.driver.OracleDriver");   //load the driver//
				Connection conn=null;
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Raj@1996");  //connect to database//
				if(conn!=null) 
					    System.out.println("Connected");
			    else
						System.out.println("NotConnected");
				conn.close();
}
}
						