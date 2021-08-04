package exerciciost29;

import java.util.Scanner;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.

public class Ex03While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, jovens=0, velhos=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		
			while (idade != -99) {
				
				if (idade<21) {
					jovens++;
				}
				
				if (idade>50) {
					velhos++;
				}
				
			System.out.println("\nDigite sua idade: ");
				idade = leia.nextInt();	
				
			}
			System.out.printf("\nO total de pessoas menores de 21 anos é %d e total de pessoas com mais de 50 anos é %d" ,jovens,velhos);
							
				
				
				
						
				
	
	

	}


}