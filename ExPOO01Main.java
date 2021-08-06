package exerciciost29;
//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

public class ExPOO01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExPOO01 [] lista = new ExPOO01 [2];
		
		lista[0] = new ExPOO01 ("Benjamin", "camiseta", (float) 59);
		lista [1] = new ExPOO01 ("Bella", "óculos", (float) 75.25);
		
		for (ExPOO01 roda: lista) {
			roda.imprimir();
		}
		

	}

}
