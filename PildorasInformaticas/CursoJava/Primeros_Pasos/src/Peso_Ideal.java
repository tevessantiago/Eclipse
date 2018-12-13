import javax.swing.*;

/**
 * Clase 20
 * Bucles
 * Do-While
 * @author Compaq Presario
 *
 */

public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		do{
			
			genero = JOptionPane.showInputDialog("Introduce tu g�nero (H/M)");
			
		}while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
		
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")){
			
			pesoIdeal = altura-110;
			
		}
		else if(genero.equalsIgnoreCase("M")){ //El if es innecesario.
			
			pesoIdeal = altura-120;
			
		}
		
		System.out.println("Tu peso ideal es: " + pesoIdeal + "kg");

	}

}
