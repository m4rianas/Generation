import java.util.Scanner;

// 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias, meses, anos, totalDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos anos voc� tem? ");
		anos = leia.nextInt();
		
		System.out.println("\nQuantos meses voc� tem? ");
		meses = leia.nextInt();
		
		System.out.println("\nQuantos dias voc� tem? ");
		dias = leia.nextInt();
		
		totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("\nVoc� viveu: " +totalDias);
		
		
		

	}

}
