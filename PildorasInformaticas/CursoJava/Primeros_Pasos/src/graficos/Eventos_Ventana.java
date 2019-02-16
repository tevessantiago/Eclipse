/**
 * 
 * Clase 68
 * Comenzamos a ver los eventos de ventana. 
 * Creamos un marco JFrame que responde a eventos.
 * 
 * Clase 69
 * En este vídeo vemos las clases adaptadoras y cómo estas simplifican notablemente el código del
 * programa cuando trabajamos con interfaces con muchos métodos.
 * 
 */

package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana mimarco = new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2 = new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300,300,500,350);
		
		mimarco2.setBounds(900,300,500,350);

	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		setTitle("Respondiendo");
		setBounds(300,300,500,350);
		setVisible(true);
		
		//M_Ventana oyenteVentana = new M_Ventana();
		
		//addWindowListener(oyenteVentana);
		
		addWindowListener(new M_Ventana()); //Equivale a las dos lineas anteriores.
		
	}
	
}

class M_Ventana extends WindowAdapter{

	public void windowIconified(WindowEvent e) { //Al minimizar la ventana
		
		System.out.println("Ventana minimizada.");
		
	}
	
}
