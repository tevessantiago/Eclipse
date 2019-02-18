package poo;

public class masmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int plusplus = 0;
		
		System.out.println(plusplus++);
		System.out.println(plusplus);
		
		int numero = 2;
		int multiplo = 3;
		
		System.out.println(multiplicar(numero,multiplo));
		System.out.println(factorial(4));

	}
	
	static int multiplicar(int numero, int multiplo) {	
		if(multiplo != 0)
			return numero + multiplicar(numero, multiplo-1);
		else
			return 0;
	}
	
	
	static int factorial(int numero) {
		
		if(numero == 0)
			return 1;
		else
			return numero * factorial(numero-1);
		
	}

}
