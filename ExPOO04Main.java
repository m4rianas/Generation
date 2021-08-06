package exerciciost29;
//4) Crie uma classe funcionário e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto funcionário, defina as
//instancias deste objeto e apresente as informações deste objeto no
//console.

public class ExPOO04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExPOO04 [] lista = new ExPOO04 [4];
		
		lista[0] = new ExPOO04 ("Ana", "Operadora de caixa", (float) 1357.87);
		lista[1] = new ExPOO04 ("Karol", "Assistente Administrativa", (float) 2975.01);
		lista[2] = new ExPOO04 ("Hannah", "Developer", (float) 5468.99);
		lista[3] = new ExPOO04 ("Melanie", "Gerente", (float) 3450);
		
		for (ExPOO04 roda: lista) {
			roda.imprimir();
		}
		

	}

}
