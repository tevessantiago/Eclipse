/**
 * 
 * Clase 62
 * En este vídeo vemos cómo cambiar el tipo de lera en el Frame. 
 * Utilizamos para ello la clase Font. 
 * 
 */

package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes mimarco = new MarcoConFuentes();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("Prueba de Fuentes");
		setSize(400,400);
		
		LaminaConFuentes milamina = new LaminaConFuentes();
		
		add(milamina);
		
		milamina.setForeground(Color.BLUE); //Todo lo que se escriba o dibuje por default en azul.
		
	}
	
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Courier", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		g2.setColor(Color.BLUE);
		
		g2.drawString("Santiago", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 24));
		
		g2.setColor(new Color(128,90,50).brighter());
		
		g2.drawString("Curso de Java", 100, 200);
		
	}
	
}
