package ar.com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;

import ar.com.domain.Farmacia;
import ar.com.domain.Tipo;

public class FarmaciaDAO extends AbstractDAO {
	
	
	public void save(Farmacia farmacia) throws SQLException{
		Statement stm = super.con.createStatement();
		
		StringTokenizer st = new StringTokenizer(farmacia.getCoords(), ",");
		
		try {
			String sql= "insert into farmacia (nombre,direccion,telefono,urlMaps,urlWeb,coords,latitud,longitud,horario,observaciones) values('"
					+ ""+farmacia.getNombre()+"',"
							+ "'"+farmacia.getDireccion()+"',"
									+ "'"+farmacia.getTelefono()+"',"
											+ "'"+farmacia.getUrlMaps()+"',"
													+ "'"+farmacia.getUrlWeb()+"',"
															+ "'"+farmacia.getCoords()+"',"
																	+ "'"+st.nextToken()+"',"
																			+"'"+st.nextToken()+"',"
																	+ "'"+farmacia.getHorario()+"',"
																			+ "'"+farmacia.getObservaciones()+"')";
																					
																							
			
		stm.executeUpdate(sql);
		
		sql = "SELECT MAX(id) AS id FROM farmacia";
		ResultSet executeQuery = stm.executeQuery(sql);
		executeQuery.next();
		int lastId = executeQuery.getInt(1);
		farmacia.setId(lastId);
		for(Tipo tipo : farmacia.getTipo()){
		sql = "insert into farmacia_has_tipo (farmacia_id,tipo_idtipo) values("+farmacia.getId()+","+tipo.getId()+")";
		stm.executeUpdate(sql);
		}
		stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
