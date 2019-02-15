/**
 * 
 * Clase 65
 * En este vídeo se explica qué son los eventos y las clases que se necesitarán para el manejo de los mismos.
 * 
 * Clase 66
 * Vemos con un ejemplo en acción a los eventos. 
 * Conseguimos que tres botones dentro de un Frame desencadenen una acción.
 * 
 */

package graficos;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		setBounds(700,300,500,300);
		
		LaminaBotones milamina = new LaminaBotones();
		
		add(milamina);
		
	}
	
}

class LaminaBotones extends JPanel implements ActionListener{ //Objeto listener
	
	JButton botonAzul = new JButton("Azul"); //Objeto fuente
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		botonAzul.addActionListener(this); //Objeto evento. "Al hacer click".
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource(); //Devuelve el objeto fuente que pulsó el boton
		
		if(botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		}
		else if(botonPulsado == botonAmarillo) {
			setBackground(Color.YELLOW);
		}
		else {
			setBackground(Color.RED);
		}
		
	}
	
}
