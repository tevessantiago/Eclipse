/**
 * Clase 26
 * 
 * @author Compaq Presario
 *
 */
public class Ejemplo_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes = 0.10;
		
		double[][] saldo = new double[6][5];
		
		for(int i = 0; i < 6; i++){
			
			saldo[i][0] = 10000; //El saldo inicial siempre es 10000			
			acumulado = 10000; //Se irá incrementando
			
			for(int j = 1; j < 5; j++) {//arranca de 1 porque los iniciales ya estan completos con 10000
				
				acumulado = acumulado+(acumulado*interes);
				
				saldo[i][j] = acumulado;
				
			}
			
			interes = interes + 0.01;
			
		}// hasta aca ya se acumularon los valores
		
		for(int z = 0; z < 6; z++){
			
			System.out.println();
			
			for(int h = 0; h < 5; h++){
				
				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print(" ");
				
			}
			
		}

	}

}
