package Entidades;

public class Tarefa {
	
	private String tempodeExecucao;
	private String planejamentoFinanceiro;
	private String docTecnica;
	private String controle;
	
	public Tarefa ( String controle, String tempodeExecucao, String planejamentoFinanceiro, String docTecnica) {
		this.controle = controle;
		this.tempodeExecucao = tempodeExecucao;
		this.planejamentoFinanceiro = planejamentoFinanceiro;
		this.docTecnica = docTecnica;
	}
	
	// Getters e Setters
	public String getControle() {
		return controle;
	}

	public void setControle(String controle) {
		this.controle = controle;
	}

	public String getTempodeExecucao() {
		return tempodeExecucao;
	}

	public void setTempodeExecucao(String tempodeExecucao) {
		this.tempodeExecucao = tempodeExecucao;
	}

	public String getPlanejamentoFinanceiro() {
		return planejamentoFinanceiro;
	}

	public void setPlanejamentoFinanceiro(String planejamentoFinanceiro) {
		this.planejamentoFinanceiro = planejamentoFinanceiro;
	}

	public String getDocTecnica() {
		return docTecnica;
	}

	public void setDocTecnica(String docTecnica) {
		this.docTecnica = docTecnica;
	}

 }

