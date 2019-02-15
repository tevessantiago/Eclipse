/**
 * 
 * Clase 63
 * Vemos en este vídeo cómo incluir imágenes en un Frame. 
 * Utilizamos las clases Image, ImageIO y Graphics
 * 
 * Clase 64
 * Terminamos de ver el trabajo con imágenes en un Frame. 
 * Vemos el método copyArea para copiar imágenes en un Frame.
 * 
 */

package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco = new MarcoImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Marco con Imagen");
		setBounds(750,300,300,200);
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
		
	}
	
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		
		//File miimagen = new File("src/graficos/coche.png");
		
		try {
			imagen = ImageIO.read(new File("src/graficos/bola.gif"));
		} catch (IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
				
		int anchuraImagen = imagen.getWidth(this);
		int alturaImagen = imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i = 0; i < 300; i++) {
			
			for(int j = 0; j < 200; j++) {
				
				if(i+j > 0)
				
				g.copyArea(0, 0, anchuraImagen, alturaImagen, i*anchuraImagen, j*alturaImagen);
				
			}
			
		}
		
	}
	
	private Image imagen;
	
	
}

