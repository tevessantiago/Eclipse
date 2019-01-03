package poo;

import java.util.*;

/**
 * Clase 33; 34 y 35
 * Unico fichero con todas las clases que necesita el programa
 * No se recomienda. No es una buena práctica.
 * Se crea un constructor que recibe parametros por primera vez.
 * @author Santiago Teves
 * Se retoma en clase 39 para ver Sobrecarga de Constructores.
 * En clase 42 se reutiliza esta clase pero aparece modificada.
 * Clase 43 Polimorfismo
 * Enlazado Dinamico: La jvm es capaz en tiempo de ejecucion de saber a que metodo perteneciente a la subclase o superclase tiene que llamar.
 * Clase 44 Casting. Clases y métodos final.
 * Se puede utilizar final en un metodo para que no pueda sobreescribirse.
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
		
		/* Empleados hasta clase 39
		 * Empleado[] misEmpleados = new Empleado[4];
		
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");*/
		
		Jefatura jefe_RRHH = new Jefatura("Santi", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
		misEmpleados[4] = jefe_RRHH; //Polimorfismo en acción. Principio de sustitución. Por almacenar un objeto de una subclase.
		misEmpleados[5] = new Jefatura("María", 95000, 1999,5,26);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5]; // Refundición/Casting
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		
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
					+ " Sueldo: " + e.dameSueldo() //Al llegar al indice de jefe, se comporta como una variable de tipo Jefatura y llama al método sobreescrito en la subclase. Enlazado Dinamico.
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
		
		++IdSiguiente;
		
		Id = IdSiguiente;
		
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01); // El this automaticamente llama al otro constructor de la clase. Si hay mas de un constructor llama al que coincida con los parametros pasados.
	}
	
	public String dameNombre() { //getter
		return nombre + " Id: " + Id;
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
	private static int IdSiguiente;
	private int Id;
	
	
}

final class Jefatura extends Empleado{ //Se utiliza la palabra final para detener la cadena de la herencia, no se pueden crear mas subclases.
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	public void estableceIncentivo(double b) {
		incentivo = b;		
	}
	
	public double dameSueldo() { //Se sobreescribe el metodo del empleado.
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	
	private double incentivo;
	
	
}