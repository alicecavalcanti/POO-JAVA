package caminhao;

public class caminhao_bau extends caminhao {
	private int volume;
	private float comprimento, largura, altura;
	
	public caminhao_bau(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade,
	float comprimento, float largura, float altura) {
	super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
		
		this.setComprimento(comprimento);
		this.setLargura(largura);
		this.setAltura(altura);
		calculaVolume();
	}


	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void carregaBau(float qtdeQuilos) {
		cargaAtual = cargaAtual+(qtdeQuilos * 1000);
	}
	
	public void descarregaBau(float qtdeQuilos) {
		cargaAtual = cargaAtual+(qtdeQuilos * 1000);
	}
	
	public void calculaVolume() {
		volume= Math.round(comprimento * largura * altura);
	}
	
}
