package ar.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDAO {
	
	protected Connection con;
	public AbstractDAO(){
	try {

		con = DriverManager
				.getConnection("jdbc:mysql://localhost/farmacia?" + "user=root&password=root");

		// Otros y operaciones sobre la base de datos...

	} catch (SQLException ex) {

		// Mantener el control sobre el tipo de error
		System.out.println("SQLException: " + ex.getMessage());

	}
	}
	
	
	public void close(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
