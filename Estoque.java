package exerciciost29;

import java.util.ArrayList;
import java.util.Scanner;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n\t::: Menu de opções :::");
			System.out.println("----------------------------------");
			System.out.println("\n(1) Adicionar produtos ao estoque"
					+ "\n(2) Remover produtos do estoque"
					+ "\n(3) Atualizar produtos do estoque"
					+ "\n(4) Mostrar produtos do estoque"
					+ "\n(0) Encerrar programa");
			System.out.println("----------------------------------");
			System.out.println("\n\t::: Digite uma opção :::");
			op = leia.nextInt();
			
			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String produtos = leia.nextLine();
				if (estoque.contains(produtos)) {
					estoque.remove(produtos);
				}
				
				else {
					System.out.println("\nProduto não existe no estoque!");
				}
				
				break;
				
			case 3:
				leia.nextLine();			
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que substituirá " +verifica+ ": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				
				else {
					System.out.println("\nProduto não existe no estoque!");
				}
				
				System.out.println("\n" +estoque);
				break;
				
			case 4:
				System.out.println("\nProdutos do estoque: ");
				System.out.println("\n" +estoque);
				break;
				default:
					System.out.println("\nVocê finalizou o programa!");
					}
			
		}while (op !=0);
	}
		
		
		

}
