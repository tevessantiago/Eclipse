package poo;

import java.util.*;

/**
 * Clase 33; 34 y 35
 * Unico fichero con todas las clases que necesita el programa
 * No se recomienda. No es una buena práctica.
 * Se crea un constructor que recibe parametros por primera vez.
 * @author Santiago Teves
 * Se retoma en clase 39 para ver Sobrecarga de Constructores.
 */

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*
		 * Aca se ve como hacer todo separado, noob.
		 * 
		Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);		
		Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);		
		Empleado empleado3 = new Empleado("María Martín", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de alta: " + empleado1.dameFechaContrato());
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de alta: " + empleado2.dameFechaContrato());
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha de alta: " + empleado3.dameFechaContrato());
		*/
		
		Empleado[] misEmpleados = new Empleado[4];
		
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		
		/*
		 * Forma normie.
		 * 
		for(int i = 0; i < 3; i++) {
			misEmpleados[i].subeSueldo(5);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()
					+ " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}
		*/
		
		//Forma pro, pero yo lo haría dentro de un solo forEach para esta situación.
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre()
					+ " Sueldo: " + e.dameSueldo()
					+ " Fecha de alta: " + e.dameFechaContrato());
		}


	}

}

class Empleado{ //Solamente una clase puede ser pública y solo una clase puede tener el método main dentro del mismo archivo java
	
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia); //Se le pasa mes -1 porque arranca de Enero como 0. (Hubiese sido mejor poner +1 y pasarle los numeros de meses reales)
		
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01); // El this automaticamente llama al otro constructor de la clase. Si hay mas de un constructor llama al que coincida con los parametros pasados.
	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){ //setter
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo += aumento;
		
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
}
