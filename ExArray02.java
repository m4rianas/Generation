package exerciciost29;

import java.util.Scanner;

//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.


public class ExArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vetor = new int [6];
		int somapar=0,somaimpar=0, x;
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<6; x++) {
			System.out.println("\nEscreva um número: ");
			vetor [x]= leia.nextInt();
			
			if (vetor [x] %2 == 0) {
				somapar++;
				System.out.println("Seu número é par");
			}//aonde? porque voce fica gritando comiggo
			
			if (vetor[x] %2 != 0) {
				somaimpar++;
				System.out.println("Seu número é impar");
			}
		}
		
		System.out.println("\nA quantidade de números pares é: " +somapar);
		System.out.println("A quantidade de números impares é: " +somaimpar);
	}
}