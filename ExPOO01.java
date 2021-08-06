package exerciciost29;
//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

import java.text.NumberFormat;

public class ExPOO01 {
	private String nome;
	private String compra;
	private float valor;
	
	public ExPOO01 (String n, String c, float v) {
		this.setNome(n);
		this.setCompra(c);
		this.setValor(v);
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCompra() {
		return compra;
	}

	public void setCompra(String compra) {
		this.compra = compra;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
		
	public String formatarMoeda () {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;
	}
	
	public void imprimir () {
		System.out.println(nome+ "\t" + "comprou " +compra+ ":" +this.formatarMoeda());
	}
	

}
