package exerciciost29;

public class Preguica1 extends Animais1{
	private String sobe;
	
	public Preguica1 (String nome, int idade, String som, String sobe) {
		super(nome, idade, som);
		this.sobe = sobe;
	}

	public String getSobe() {
		return sobe;
	}

	public void setSobe(String sobe) {
		this.sobe = sobe;
	}
	
	

}
