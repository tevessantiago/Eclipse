import java.util.*;

/**
 * Clase 19 Bucles
 * Otro ejemplo del bucle while
 * Este programa no entra al while si se generó el numero cero.
 * Se puede solucionar utilizando do-while, se vera en la siguiente clse.
 * @author Compaq Presario
 *
 */

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// se crea un numero aleatorio entre 0 y 100
		int aleatorio = (int) (Math.random() * 100); // Math.random() devuelve un numero aleatorio entre 0 y 1

		// Se evalua el numero para adivinar

		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int intentos = 0;

		while (numero != aleatorio) {
			
			intentos++;

			System.out.println("Introduce un numero, por favor.");

			numero = entrada.nextInt();

			if (aleatorio < numero) {

				System.out.println("El número es menor!");

			} else if (aleatorio > numero) {

				System.out.println("El número mayor!");

			}

		}
		
		System.out.println("Adivinaste! en " + intentos + " intentos.");

		entrada.close();

	}

}
