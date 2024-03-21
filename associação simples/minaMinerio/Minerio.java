package minaMinerio;

public class Minerio {
	private int idMinerio;
	private String descricao;
	
	public Minerio (int idMinerio, String descricao) {
		this.idMinerio =idMinerio;
		this.descricao = descricao;
	}
	
	public int getIdMinerio() { 
		return idMinerio;
	}
	public String getDescricao() { 
		return descricao;
	}
	public void setDescricao(String descricao) {
	this.descricao = descricao;
	}
}
