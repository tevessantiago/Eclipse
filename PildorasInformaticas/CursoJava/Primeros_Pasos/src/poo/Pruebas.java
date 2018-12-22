package poo;

/**
 * Clase 36 Y 37
 * Constantes: Uso Final.
 * Constantes: Uso Static.
 * @author Santiago Teves
 * Una constante es un espacio en memoria al que se le asigna un valor que no se puede modificar.
 * Ver Math.PI
 * Al instanciar un objeto se le asignan copias de los atributos de la clase.
 * Al usar Static se utiliza una única copia para todos los objetos. Todos los objetos comparten la misma variable.
 */

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		//trabajador1.cambiaNombre("Maria"); //Esto no tiene sentido y no deberia suceder, hay que evitar que se pueda cambiar el nombre con final.
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		

	}

}

class Empleados{
	
	//Se quiere crear una serie de trabajadores que trabajan en una empresa, la cual tiene una regla:
	//Los trabajadores que entran nuevos a trabajar tienen que empezar en el depto de administracion.
	//Con el tiempo puede cambiar pero todos tienen que arrancar en administracion.
	
	private final String nombre; //Con final se hace constante, no se le puede dar valor mas de una vez.
	private String seccion;
	private int id; 
	private static int idSiguiente=1; //Todos los objetos van a tener la misma copia de idSiguiente. Si no uso static, todos los id quedan en 1.
	
	public Empleados(String nom){
		
		nombre 	= nom;
		seccion = "Administración";
		id 		= idSiguiente;		
		idSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion){ //setter
		this.seccion = seccion;
	}
	
	/*public void cambiaNombre(String nombre){
		
		this.nombre = nombre;
		
	}*/
	
	public String devuelveDatos(){ //getter
		
		return "El nombre es: " + nombre + " y la sección es: " + seccion + " y el Id=" + id;
		
	}
	
}