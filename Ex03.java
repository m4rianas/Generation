package exerciciost29;

import java.util.Scanner;

//3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
//categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade; 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual sua idade? ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("\nSua categoria � infantil.");
		}
		
		else if (idade >= 15 && idade <= 17) {
			System.out.println("\nSua categoria � juvenil.");
		}
		
		else if (idade >= 18 && idade <= 25) {
			System.out.println("\nSua categoria � adulto.");
		}
		
		else {
			System.out.println("\nIdade fora do intervalo aceito.");
		}
		}

}
