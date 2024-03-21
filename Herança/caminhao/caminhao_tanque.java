package caminhao;

public class caminhao_tanque extends caminhao {
	private String tipo;
	public caminhao_tanque(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade) {
		super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
		this.tipo= tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void encheTanque() {
		setCapacidadeTotal((int)cargaAtual);
	}
	
	public void esvaziaTanque() {
		cargaAtual = 0;
	}
	
	public void abastaceTanque(int qtdeLitros) {
		cargaAtual += qtdeLitros;
	}
	public void descarregaTanque(int qtdeLitros) {
		cargaAtual -=qtdeLitros;
	}

}
