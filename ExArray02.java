package exerciciost29;

import java.util.Scanner;

//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados.


public class ExArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vetor = new int [6];
		int somapar=0,somaimpar=0, x;
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<6; x++) {
			System.out.println("\nEscreva um n�mero: ");
			vetor [x]= leia.nextInt();
			
			if (vetor [x] %2 == 0) {
				somapar++;
				System.out.println("Seu n�mero � par");
			}//aonde? porque voce fica gritando comiggo
			
			if (vetor[x] %2 != 0) {
				somaimpar++;
				System.out.println("Seu n�mero � impar");
			}
		}
		
		System.out.println("\nA quantidade de n�meros pares �: " +somapar);
		System.out.println("A quantidade de n�meros impares �: " +somaimpar);
	}
}