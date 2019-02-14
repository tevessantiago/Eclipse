/**
 * 
 * Clase 59
 * Comenzamos a ver en este vídeo cómo dibujar dentro del frame. utilizamos la clase Graphics y sus métodos. 
 * Veremos en el proximo vídeo cómo utilizar la biblioteca Java 2D para dibujos más avanzados.
 * 
 * Clase 60
 * En este vídeo vemos cómo utilizar la biblioteca 2D de Java. 
 * Vemos ejemplos con las clases Rectangle2D, Ellipse2D y Line2D.
 * 
 */


package graficos;

import java.awt.*;
import java.awt.geom.*;

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
		//g.drawArc(50, 100, 100, 200, 120, 150);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double centroEnX = rectangulo.getCenterX();
		double centroEnY = rectangulo.getCenterY();
		//double radio = 150; //Radio que usa en el video
		double radio = Math.hypot(rectangulo.getWidth(), rectangulo.getHeight()) / 2; // Formula de un comentario para que el circulo quede circunscrito al rectangulo.
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio, centroEnY+radio);
		
		g2.draw(circulo);
		
	}
	
}