import java.util.Scanner;

// 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias, meses, anos, totalDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos anos você tem? ");
		anos = leia.nextInt();
		
		System.out.println("\nQuantos meses você tem? ");
		meses = leia.nextInt();
		
		System.out.println("\nQuantos dias você tem? ");
		dias = leia.nextInt();
		
		totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("\nVocê viveu: " +totalDias);
		
		
		

	}

}
