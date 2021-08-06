package exerciciost29;
//4) Crie uma classe funcionário e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto funcionário, defina as
//instancias deste objeto e apresente as informações deste objeto no
//console.

import java.text.NumberFormat;

public class ExPOO04 {
	private String nome;
	private String areaAtuacao;
	private float salario;
	
	public ExPOO04 (String n, String a, float s) {
		this.setNome(n);
		this.setAreaAtuacao(a);
		this.setSalario(s);
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String formatarMoeda () {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir () {
		System.out.println(nome+ "-" +areaAtuacao+ "-" +this.formatarMoeda());
	}
	

}
