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
		
		setTitle("Prueba con Imagen");
		setBounds(750,300,300,200);
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
		
	}
	
}

class LaminaConImagen extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//File miimagen = new File("src/graficos/coche.png");
		
		try {
			imagen = ImageIO.read(new File("src/graficos/coche.png"));
		} catch (IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		
		g.drawImage(imagen, 5, 5, null);
		
	}
	
	private Image imagen;
	
	
}

