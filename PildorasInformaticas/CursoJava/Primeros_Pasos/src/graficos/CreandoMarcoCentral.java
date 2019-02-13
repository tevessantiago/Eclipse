/**
 * 
 * Clase 57
 * Se coloca una ventana en el centro de la pantalla y se le cambia el icono de Java.
 * 
 */

package graficos;

import java.awt.*;

import javax.swing.*;

public class CreandoMarcoCentral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4); //Para que este centrado
		
		setTitle("marcoCentrado");
		
		Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
		
		setIconImage(miIcono);
		
	}
	
}
