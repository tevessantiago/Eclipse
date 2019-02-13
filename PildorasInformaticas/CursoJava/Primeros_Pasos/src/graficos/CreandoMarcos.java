/**
 * 
 * Clase 55
 * Se crea la clase miMarco con una ventana de 500x300 que al cerrarse termina la ejecución del programa.
 * 
 * Clase 56 
 * Se ven metodos de la clase JFrame para manipular la ventana.
 * 
 */

package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		
		//setSize(500,300);
		
		//setLocation(500,300);
		
		setBounds(500,300,550,250); // Asigna el tamaño y ubicación de la ventana.
		
		//setResizable(false); // Permiso para cambiar el tamaño de la ventana.
		
		//setExtendedState(Frame.MAXIMIZED_BOTH); //Inicia la ventana maximizada. Vertical y Horizontal.
		
		setTitle("Mi ventana");
		
	}
	
}
