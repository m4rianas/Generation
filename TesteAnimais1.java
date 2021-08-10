package exerciciost29;

public class TesteAnimais1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro1 cachorro = new Cachorro1 ("Rauphi", (int) 10, "latido", "corre");
		Cavalo1 cavalo = new Cavalo1 ("Jade", (int) 2, "relincha", "corre");
	 	Preguica1 preguica = new Preguica1 ("Soneca", (int) 7, "emite sons", "Escala tudo");
	 	
		System.out.println("Nome do animal: " +cachorro.getNome()+ "\nIdade do animal: " +cachorro.getIdade()+ "\nQual som emite: " +cachorro.getSom()+ "\nHabilidade: "+cachorro.getCorre());
		System.out.println("Nome do animal: " +cavalo.getNome()+ "\nIdade do animal: " +cavalo.getIdade()+ "\nQual som emite: " +cavalo.getSom()+ "\nHabilidade: "+cavalo.getCorre());
		System.out.println("Nome do animal: " +preguica.getNome()+ "\nIdade do animal: " +preguica.getIdade()+ "\nQual som emite: " +preguica.getSom()+ "\nHabilidade: "+preguica.getSobe());
	
	

	}

}
