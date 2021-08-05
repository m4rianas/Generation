package exerciciost29;

import java.util.Scanner;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui

public class ExArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz = new int[3][3];
		int linha, coluna, soma=0;
		Scanner leia = new Scanner(System.in);
		
		for (linha=0; linha<3; linha++) {
			for (coluna=0; coluna<3; coluna++) {
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if (matriz[linha][coluna]>10) {
					soma++;
					System.out.println("\nA quantidade de números maiores que 10 é: " +soma);
				}
			}
			
			
		}
		
	}

}
