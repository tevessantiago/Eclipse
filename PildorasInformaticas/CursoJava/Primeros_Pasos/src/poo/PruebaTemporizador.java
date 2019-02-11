/**
 * Clase 52
 * Segundo ejemplo de utilización de Interfaces.
 */
package poo;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa 'OK' para detener.");
		
		System.exit(0);

	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 sg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep(); //Hace un sonido el SO
		
		
	}
	
}
