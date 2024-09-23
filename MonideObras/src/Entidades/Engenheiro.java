package Entidades;

public class Engenheiro {

	private String nome;
	private int idade;
	private int email;
	private String calculos;
	
	public Engenheiro(String calculos, String nome, int idade, int email){
		this.calculos = calculos;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}
	
	// Getters e Setters
	public String getCalculos() {
		return calculos;
	}

	public void setCalculos(String calculos) {
		this.calculos = calculos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	
	}
 }