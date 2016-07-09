package ar.com.farmacia;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ar.com.DAO.FarmaciaDAO;
import ar.com.DAO.TipoDAO;
import ar.com.domain.Farmacia;
import ar.com.domain.Tipo;

public class Inicio extends JFrame{

	
	private JPanel panelDatos;
	private JTextField nombre;
	private JTextField direccion;
	private JTextField telefono;
	private JTextField urlMaps;
	private JTextField urlWeb;
	private JTextField coords;
	private JButton boton;
	private JComboBox<Tipo> tipo;
	private List<Tipo> tipos;
	private JLabel labelTipo;
	private JButton botonAceptar ;
	private JPanel panelTipo;
	
	private TipoDAO tipoDAO;
	
	private FarmaciaDAO farmDAO = new FarmaciaDAO();
	
	public Inicio() throws SQLException{
		
		this.setSize(new Dimension(203, 380));
		this.setVisible(true);
		this.setLocation(new Point(400, 400));
		
		tipoDAO = new TipoDAO();
		
		tipos=new LinkedList<Tipo>();
		
		

	
		tipo= new JComboBox<Tipo>();
		panelDatos= new JPanel();
		panelTipo= new JPanel();
		
		nombre = new JTextField(15);
		telefono = new JTextField(15);
		urlMaps= new JTextField(15);
		urlWeb= new JTextField(15);
		coords = new JTextField(15);
		direccion = new JTextField(15);
		
		boton=new JButton("agregar");
		botonAceptar = new JButton("Aceptar");
		
		labelTipo = new JLabel("none");
		
		//hasta la p
		cargarTipos();
		
		panelDatos.setLayout(new FlowLayout());
//		panelDatos.add(new JLabel("tipos de esta farmacia"));
//		panelDatos.add(labelTipo);
		panelTipo.setLayout(new FlowLayout());
		panelTipo.add(new JLabel("tipos de esta farmacia"));
		panelTipo.add(labelTipo);
		panelDatos.add(panelTipo);
		
		
		
		panelDatos.add(new JLabel("Nombre"));
		panelDatos.add(nombre);
		panelDatos.add(new JLabel("Direccion"));
		panelDatos.add(direccion);
		panelDatos.add(new JLabel("Telefono"));
		panelDatos.add(telefono);
		panelDatos.add(new JLabel("urlMaps"));
		panelDatos.add(urlMaps);
		panelDatos.add(new JLabel("urlWeb"));
		panelDatos.add(urlWeb);
		panelDatos.add(new JLabel("Coordenadas"));
		panelDatos.add(coords);
		panelDatos.add(new JLabel("tipo"));
		panelDatos.add(tipo);
		panelDatos.add(boton);
		panelDatos.add(botonAceptar);
		add(panelDatos);
		
		boton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String text = labelTipo.getText();
				
				
				if(text.equals("none")){
					labelTipo.setText("");
					text ="";
					
				}
				tipos.add((Tipo) tipo.getSelectedItem());
				
				labelTipo.setText(text+tipo.getSelectedItem());
				
				
			}
		});
		
		botonAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				Farmacia farmacia = new Farmacia();
				farmacia.setNombre(nombre.getText());
				farmacia.setDireccion(direccion.getText());
				farmacia.setTelefono(telefono.getText());
				farmacia.setTipo(tipos);
				farmacia.setUrlMaps(urlMaps.getText());
				farmacia.setUrlWeb(urlWeb.getText());
				farmacia.setCoords(coords.getText());
				
				
				try {
					farmDAO.save(farmacia);
					reset();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}

			private void reset() {
				
				nombre.setText("");
				direccion.setText("");
				urlMaps.setText("");
				urlWeb.setText("");
				coords.setText("");
				telefono.setText("");
				tipos.clear();
				labelTipo.setText("none");
				
			}
		});
		
		this.revalidate();
		
		
		
		
		
	}

	private void cargarTipos() throws SQLException {
		
		for (Tipo tipo1 : tipoDAO.getTipos()) {
			tipo.addItem(tipo1);
		}
	}
	
}
