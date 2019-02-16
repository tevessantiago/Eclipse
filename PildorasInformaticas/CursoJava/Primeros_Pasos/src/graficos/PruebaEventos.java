/**
 * 
 * Clase 65
 * En este vídeo se explica qué son los eventos y las clases que se necesitarán para el manejo de los mismos.
 * 
 * Clase 66
 * Vemos con un ejemplo en acción a los eventos. 
 * Conseguimos que tres botones dentro de un Frame desencadenen una acción.
 * 
 * Clase 67
 * Vemos en este vídeo otra forma de enfocar el programa del vídeo anterior. 
 * Utilizamos el concepto de clases internas para hacer que el programa funcione.
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

class LaminaBotones extends JPanel { //Objeto listener
	
	JButton botonAzul = new JButton("Azul"); //Objeto fuente
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(Azul);
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);
		
	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
			
		}
		
		private Color colorDeFondo;
		
	}
	
}

