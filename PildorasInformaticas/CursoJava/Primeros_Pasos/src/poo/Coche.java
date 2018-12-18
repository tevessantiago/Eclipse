package poo;

public class Coche {
	
	private int ruedas = 4;
	private int largo; //cm
	private int ancho; //cm
	private int motor; //cm cubico
	private int peso_plataforma; //kg
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche(){
		
		ruedas 				= 4;
		largo 				= 2000;
		ancho 				= 300;
		motor 				= 1600;
		peso_plataforma 	=  500;
		
	}
	
	public String dime_datos_generales(){ // GETTER
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas " +
		". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
		" cm y un peso de plataforma de " + peso_plataforma + " kg";
		
		
	}
	
	public void establece_color(String color_coche){ //SETTER
		
		//color = "azul";
		
		color = color_coche;
		
	}
	
	public String dime_color(){
		
		return "El color del coche es " + color;
		
	}
	
	public void configura_asientos(String asientos_cuero){ //SETTER
		
		if(asientos_cuero == "si"){
			this.asientos_cuero = true;
		}else{
			this.asientos_cuero = false;
		}
		
	}
	
	public String dime_asientos(){
		
		if(asientos_cuero == true){
			
			return "El coche tiene asientos de cuero";
			
		}else{
			
			return "El coche tiene asientos de serie";
		}
		
	}

}
