package exerciciost29;

public class Cavalo1 extends Animais1 {
	private String corre;
	
	public Cavalo1 (String nome, int idade, String som, String corre) {
		super(nome, idade, som);
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome do animal: " +getNome()+ "\nIdade do animal: " +getIdade()+ "\nQual som emite: " +getSom()+ "\nHabilidade: "+getCorre());
	}

}
