package exerciciost29;

import java.util.Scanner;

//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.

public class Ex02For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, impar=0, par=0, x;
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=10; x++) {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			}
			
			
			else {
				impar++;
			}
			
			System.out.printf("\nFoi digitado %d números pares e %d números impares" ,par,impar);
		}

	}
}