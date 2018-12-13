import javax.swing.JOptionPane;

/**
 * Clase 21 y 22
 * For statement
 * @author Compaq Presario
 *
 */

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0; //cantidad de arrobas en el string
		
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		for(int i = 0; i < mail.length(); i++){
			
			if(mail.charAt(i) == '@'){
				
				arroba++;
			}
			
			if(mail.charAt(i) == '.'){
				
				punto = true;
				
			}
			
		}
		
		if(arroba == 1 && punto == true){
			
			System.out.println("El mail es correcto");
			
		}
		
		else{
			
			System.out.println("El mail no es correcto");
			
		}

	}

}
