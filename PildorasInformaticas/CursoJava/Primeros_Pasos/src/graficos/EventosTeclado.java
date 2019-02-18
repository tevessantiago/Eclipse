/**
 * 
 * Clase 71
 * Comenzamos a ver en este v�deo los eventos de teclado. 
 * C�mo desencadenar acciones en funci�n de la tecla pulsada.
 * 
 */

package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTeclas mimarco = new MarcoConTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas() {

		setBounds(700,300,600,450);
		setVisible(true);
		
		EventoDeTeclado tecla = new EventoDeTeclado();
		
		addKeyListener(tecla);
		
	}
	
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		
		//int codigo = e.getKeyCode();
		
		//System.out.println(codigo);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		char letra = e.getKeyChar();
		
		System.out.println(letra);
		
	}
	
	
	
}