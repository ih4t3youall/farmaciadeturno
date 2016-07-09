package ar.com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import ar.com.domain.Tipo;

public class TipoDAO extends AbstractDAO{
	
	
	
	public TipoDAO(){
		
		super();
		Statement st=null;
		try {
			st= con.createStatement();
			ResultSet executeQuery = st.executeQuery("select * from tipo");
			if(!executeQuery.next()){
				
				for(char a='a';a<'q';a++){
					
					st.executeUpdate("insert into tipo (letra) values ('"+a+"')");
					
				}
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	
		
		
	}
	
	
	
	public List<Tipo> getTipos() throws SQLException{
		
		List<Tipo> tipos = new LinkedList<Tipo>();
		String sql = "select * from tipo;";
		Statement st = con.createStatement();
		ResultSet executeQuery = st.executeQuery(sql);
		
		
		while(executeQuery.next()){
			
			Tipo tipo = new Tipo();
			tipo.setId(executeQuery.getInt(1));
			tipo.setTipo(executeQuery.getString(2));
			tipos.add(tipo);
		}
		
		return tipos;
		
		
	}

}
