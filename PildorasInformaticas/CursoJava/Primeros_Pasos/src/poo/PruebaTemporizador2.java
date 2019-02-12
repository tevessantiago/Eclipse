/**
 * 
 * Clase 53
 * Clases Internas
 * Se crea la clase interna DameLaHora2
 * Debe llevar el modificador de acceso private
 * 
 * Clase 54
 * Clases Internas 2
 * Se convierte la clase interna DamelaHora2 en una clase interna local (Dentro de un metodo)
 * No debe llevar el modificador de acceso private
 * 
 */

package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj miReloj = new Reloj();
		
		miReloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulse 'OK' para terminar.");
		
		System.exit(0);

	}

}

class Reloj{
	
	public void enMarcha(int intervalo, boolean sonido) {
		
		class DameLaHora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora = new Date();
				
				System.out.println("Te pongo la hora cada 3 sg: " + ahora);
				
				if(sonido) { //Está definido fuera de la clase y puede acceder aunque esté encapsulado.
					
					Toolkit.getDefaultToolkit().beep();
					
				}
				
			}
			
		}
		
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
		
	}
	
}
