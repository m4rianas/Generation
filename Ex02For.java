package exerciciost29;

import java.util.Scanner;

//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

public class Ex02For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, impar=0, par=0, x;
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=10; x++) {
			System.out.println("\nDigite um n�mero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			}
			
			
			else {
				impar++;
			}
			
			System.out.printf("\nFoi digitado %d n�meros pares e %d n�meros impares" ,par,impar);
		}

	}
}