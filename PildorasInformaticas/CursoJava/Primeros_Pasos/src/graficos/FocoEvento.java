/**
 * Clase 74
 * Vemos en este vídeo como manejar los eventos de foco. 
 * Utilizamos para ello la inteface FocusListener.
 * 
 * Clase 75
 * 
 * 
 */

package graficos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFoco mimarco = new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {

		setBounds(300,300,600,450);
		
		setVisible(true);
		
		add(new LaminaFoco());
		
	}
	
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1 = new JTextField();
		
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos elFoco = new LanzaFocos();
		
		cuadro1.addFocusListener(elFoco);
		
	}
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
			
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("He perdido el foco");
			
		}
		
		
		
	}
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
}