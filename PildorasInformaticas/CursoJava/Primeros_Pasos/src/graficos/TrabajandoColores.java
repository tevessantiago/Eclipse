/**
 * 
 * Clase 61
 * En este vídeo vemos como utilizar colores para el texto, las figuras y la lamina del frame. 
 * Utilizamos para ello la clase Color.
 * 
 */

package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco = new MarcoConColor();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("prueba de colores");
		setSize(400,400);
		
		LaminaConColor milamina = new LaminaConColor();
		
		add(milamina);
		
		//milamina.setBackground(Color.PINK);
		
		milamina.setBackground(SystemColor.window); //Color default del SO de background.
		
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//Dibujo rectangulo
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.BLUE);
		
		g2.draw(rectangulo);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		//Dibujo elipse
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color miColor = new Color(125,189,200);
		
		//g2.setPaint(new Color(109,172,59));
		
		g2.setPaint(miColor);
		
		g2.fill(elipse);
		
	}
	
}
