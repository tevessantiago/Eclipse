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

		while (clave.equals(pass) == false) { // lo podr�a haber negado

			pass = JOptionPane.showInputDialog("Introduce la contrase�a, por favor.");

			if (clave.equals(pass) == false) {

				System.out.println("Contrase�a incorrecta.");

			}
		}

		System.out.println("Contrase�a correcta. Acceso permitido.");

	}

}
