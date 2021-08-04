package exerciciost29;
//5- Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

import java.util.Scanner;

public class Ex05DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, soma=0;
		Scanner leia = new Scanner(System.in);
		
				
				do {
					System.out.println("\nDigite um número: ");
					numero = leia.nextInt();
					
					if (numero >0) {
						soma += numero;
					}
				}while (numero !=0);
				
				
				System.out.printf("\nA soma dos números é %d",soma);
					
				
					

				}
				
	}
	


