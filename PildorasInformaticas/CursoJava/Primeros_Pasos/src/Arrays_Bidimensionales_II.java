/**
 * Clase 25
 * Array bidimensional declarado de otra forma y recorrido con for each
 * @author Compaq Presario
 *
 */
public class Arrays_Bidimensionales_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		
		for(int[] fila:matrix){
			
			System.out.println();
			
			for(int z:fila){
				
				System.out.print(z + " ");
				
			}
			
		}

	}

}
