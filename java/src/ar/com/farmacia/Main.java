package ar.com.farmacia;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		
		try {
			new Inicio();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Re crasheo loco!");
			e.printStackTrace();
		}

	}

}
