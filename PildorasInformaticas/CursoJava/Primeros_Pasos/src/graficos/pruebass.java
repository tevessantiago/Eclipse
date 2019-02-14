package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class pruebass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente = false;
		
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombreDeLaFuente: nombresDeFuentes) {
			
			if(nombreDeLaFuente.equals(fuente)) {
				estalafuente = true;
			}
			
			//System.out.println(nombreDeLaFuente); //Ver todas las fuentes instaladas
		}
		
		if(estalafuente) {
			System.out.println("Fuente instalada.");
		}else {
			System.out.println("La fuente no esta instalada.");
		}

	}

}
