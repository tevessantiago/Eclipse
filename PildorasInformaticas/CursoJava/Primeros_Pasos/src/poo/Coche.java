package poo;

public class Coche {
	
	private int ruedas = 4;
	private int largo; //cm
	private int ancho; //cm
	private int motor; //cm cubico
	private int peso_plataforma; //kg
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche(){
		
		ruedas 				= 4;
		largo 				= 2000;
		ancho 				= 300;
		motor 				= 1600;
		peso_plataforma 	=  500;
		
	}
	
	public String dime_largo(){ // GETTER
		
		return "El largo del coche es " + largo;
		
	}
	
	public void establece_color(){ //SETTER
		
		color = "azul";
		
	}
	
	public String dime_color(){
		
		return "El color del coche es " + color;
		
	}

}
