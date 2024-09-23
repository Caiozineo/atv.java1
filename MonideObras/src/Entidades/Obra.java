package Entidades;

public class Obra {

	private String nome;
	private String localizacao;
	private double custoEstimado;
	private int numDeAndares;
	
	public Obra(String nome, String localizacao, double custoEstimado, int numDeAndares) {
		this.nome = nome;
		this.localizacao = localizacao;
		this.custoEstimado = custoEstimado;
		this.numDeAndares = numDeAndares;
	}
	public Obra() {
		
	}
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getCustoEstimado() {
		return custoEstimado;
	}

	public void setCustoEstimado(double custoEstimado) {
		this.custoEstimado = custoEstimado;
	}

	public int getNumDeAndares() {
		return numDeAndares;
	}

	public void setNumDeAndares(int numDeAndares){
		this.numDeAndares = numDeAndares;
	
	}
	
}