package Herancas;

import Entidades.Obra;

public class ObraComercial extends Obra {

	  	public ObraComercial(String nome, String localizacao, double custoEstimado, int numDeAndares) {
	  		super(nome, localizacao, custoEstimado, numDeAndares);
    }
    
	  	public String exibirInformacoes() {
	  		return (getNome() + " " + getLocalizacao() + " " + getCustoEstimado() + " " + getNumDeAndares());  
    }

	
}
