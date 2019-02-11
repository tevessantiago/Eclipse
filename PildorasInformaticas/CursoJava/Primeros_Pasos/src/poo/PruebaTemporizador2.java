/**
 * 
 * Clase 53
 * Clases Internas
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
		
		Reloj miReloj = new Reloj(3000, true);
		
		miReloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulse 'OK' para terminar.");
		
		System.exit(0);

	}

}

class Reloj{
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		this.sonido = sonido;
		
	}
	
	public void enMarcha() {
		
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
		
	}
	
	private int intervalo;
	private boolean sonido;
	
	private class DameLaHora2 implements ActionListener{
		
		public void actionPerformed(ActionEvent evento) {
			
			Date ahora = new Date();
			
			System.out.println("Te pongo la hora cada 3 sg: " + ahora);
			
			if(sonido) { //Está definido fuera de la clase y puede acceder aunque esté encapsulado.
				
				Toolkit.getDefaultToolkit().beep();
				
			}
			
		}
		
	}
	
}
