package caminhao;

public abstract class caminhao {
	private int nrCaminhao, anoFabricacao, capacidadeTotal;
	private String modelo;
	protected float cargaAtual;
	private char unidade;
	
	public caminhao(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade){
		this.setNrCaminhao(nrCaminhao);
		this.setModelo(modelo);
		this.setAnoFabricacao(anoFabricacao);
		this.setCapacidadeTotal(capacidadeTotal);
		this.setUnidade(unidade);
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getNrCaminhao() {
		return nrCaminhao;
	}

	public void setNrCaminhao(int nrCaminhao) {
		this.nrCaminhao = nrCaminhao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public char getUnidade() {
		return unidade;
	}

	public void setUnidade(char unidade) {
		this.unidade = unidade;
	}
	
	
}
