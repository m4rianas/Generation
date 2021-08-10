package exerciciost29;

public class Cachorro1 extends Animais1 { //TA PORRA
	private String corre;
	
	public Cachorro1 (String nome, int idade, String som, String corre) {
		super(nome, idade, som);
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	

}
