package Persistence;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConnectionFactory {
	public Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/spic","root","root");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}

}
