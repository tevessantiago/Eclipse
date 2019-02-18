/**
 * 
 * Clase 72
 * En este vídeo comenzamos a ver los eventos de ratón. 
 * Utilizamos la Interface MouseListener y la clase adaptadora MouseAdapter.
 * 
 */

package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco = new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {

		setBounds(700,300,600,450);
		setVisible(true);
		
		EventosDeRaton eventoRaton = new EventosDeRaton();
		
		addMouseListener(eventoRaton);
		
	}
	
}

class EventosDeRaton implements MouseListener{ //O se puede extender de MouseAdapter para implementar solo los metodos necesarios.

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Acabas de entrar.");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Acabas de salir.");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Acabas de presionar.");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Acabas de levantar.");
		
	}
	
	
}
