package exerciciost29;
//5- Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)

import java.util.Scanner;

public class Ex05DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, soma=0;
		Scanner leia = new Scanner(System.in);
		
				
				do {
					System.out.println("\nDigite um n�mero: ");
					numero = leia.nextInt();
					
					if (numero >0) {
						soma += numero;
					}
				}while (numero !=0);
				
				
				System.out.printf("\nA soma dos n�meros � %d",soma);
					
				
					

				}
				
	}
	


