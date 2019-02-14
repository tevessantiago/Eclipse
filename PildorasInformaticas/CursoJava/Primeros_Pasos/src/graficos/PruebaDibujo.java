/**
 * 
 * Clase 59
 * Comenzamos a ver en este vídeo cómo dibujar dentro del frame. utilizamos la clase Graphics y sus métodos. 
 * Veremos en el proximo vídeo cómo utilizar la biblioteca Java 2D para dibujos más avanzados.
 * 
 */


package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos mimarco = new MarcoConDibujos();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("prueba de Dibujo");
		setSize(400,400);
		
		LaminaConFiguras milamina = new LaminaConFiguras();
		
		add(milamina);
		
	}
	
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 200, 200);
		
		//g.drawLine(100, 100, 300, 200);
		
		g.drawArc(50, 100, 100, 200, 120, 150);
		
	}
	
}