import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias, meses, anos, totalDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o total de dias: ");
		totalDias = leia.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = ((totalDias % 365) % 30);
		
		System.out.println("\nVocê viveu: " +anos+ " anos (s) e " +meses+ " mes(es) " +dias+ "dia(s)");
				
	}
	

}
