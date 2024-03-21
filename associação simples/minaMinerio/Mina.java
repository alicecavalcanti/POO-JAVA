package minaMinerio;

import java.util.Date;

public class Mina {
	private int idMina;
	private int estoque;
	private Date dataFundacao;
	private Minerio minerio;
	
	public Mina(int idMina, Minerio minerio,Date dataFundacao) {
	this.idMina = idMina;
	this.minerio = minerio;
	this.dataFundacao = dataFundacao;
	}
	public int getIdMina() { 
		return idMina; 
	}
	public int getEstoque() { 
		return estoque;
	}
	public Date getDataFundacao() { 
		return dataFundacao;
	}
	public Minerio getMinerio() {
		return minerio; 
	}
	public void setMinerio(Minerio minerio){
	this.minerio = minerio;
	}
	
	public void producao (int qtde) { 
		estoque+=qtde;
	}
	public void escoamento(int qtde) { 
		estoque-=qtde;
	}
}
