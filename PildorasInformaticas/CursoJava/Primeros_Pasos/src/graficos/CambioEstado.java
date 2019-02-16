/**
 * 
 * Clase 70
 * En este vídeo vemos como desencadenar eventos cuando una vetana cambia de estado. 
 * Utilizamos para ello la interfaz WindowStateChanged y la calse WindowEvent.
 * 
 */

package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado mimarco = new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {

		setBounds(300,300,500,350);
		setVisible(true);
		
		CambiaEstado nuevo_estado = new CambiaEstado();
		
		addWindowStateListener(nuevo_estado);
		
	}
	
}

class CambiaEstado implements WindowStateListener{

	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("La ventana ha cambiado de estado.");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana está a pantalla completa.");
		}else if(e.getNewState() == Frame.NORMAL) {
			System.out.println("La ventna está normal");
		}else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana está minimizada.");
		}
		
	}
	
}
