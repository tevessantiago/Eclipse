import javax.swing.*;

/**
 * Clase 17 Bucles While
 * 
 * @author Compaq Presario
 *
 */
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "Juan";
		String pass = "";

		while (clave.equals(pass) == false) { // lo podrìa haber negado

			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor.");

			if (clave.equals(pass) == false) {

				System.out.println("Contraseña incorrecta.");

			}
		}

		System.out.println("Contraseña correcta. Acceso permitido.");

	}

}
