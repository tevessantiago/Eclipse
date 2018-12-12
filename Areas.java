import java.util.*;
import javax.swing.*;

/**
 * Clase 17
 * Condicionales 2
 * Switch
 * @author st98105
 *
 */

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		int figura = entrada.nextInt(); //se lee lo que se ingresa por teclado (nextInt) y se almacena en figura.
		
		switch(figura){
			
		case 1:
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado")); //Abre un cuadro de di�logo grafico.
			
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2)); //Lado al cuadrado.
			
			break;
			
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del rectangulo es: " + base * altura);
			
			break;
		
		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del triangulo es: " + (base * altura) / 2);
			
			break;
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El area del circulo es: ");
			
			System.out.printf("%1.2f", Math.PI * Math.pow(radio, 2));
			
			break;
			
		}	

	}

}
