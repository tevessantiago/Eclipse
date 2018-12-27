package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Empleado2{ //Solamente una clase puede ser pública y solo una clase puede tener el método main dentro del mismo archivo java
	
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia); //Se le pasa mes -1 porque arranca de Enero como 0. (Hubiese sido mejor poner +1 y pasarle los numeros de meses reales)
		
		altaContrato = calendario.getTime();
		
		++IdSiguiente;
		
		Id = IdSiguiente;
		
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
