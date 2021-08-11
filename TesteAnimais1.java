package exerciciost29;

public class TesteAnimais1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro1 cachorro = new Cachorro1 ("Rauphi", (int) 10, "latido", "corre");
		Cavalo1 cavalo = new Cavalo1 ("Jade", (int) 2, "relincha", "corre");
	 	Preguica1 preguica = new Preguica1 ("Soneca", (int) 7, "emite sons", "Escala tudo");
	 	
		cachorro.imprimirInfo();
		cavalo.imprimirInfo();
		preguica.imprimirInfo();
	

	}

}
