package poo;

//import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		/*Coche micoche = new Coche();
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		System.out.println(micoche.dime_asientos());
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio final del coche es: " + micoche.precio_coche());*/
		
		Coche micoche1 = new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		
		miFurgoneta1.establece_color("Azul");
		miFurgoneta1.configura_asientos("Si");
		miFurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		System.out.println(miFurgoneta1.dime_datos_generales() + " " + miFurgoneta1.dimeDatosFurgoneta());
		
	}

}
