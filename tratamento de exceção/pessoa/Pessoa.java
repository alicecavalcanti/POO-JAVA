package br.com.unit.aula13;

public class Pessoa {
	private int id;
	private String nome;
	private String email;
	private int rendaFamilia;
	private int membrosFamilia;
	
	public Pessoa(int id, String nome, String email, int rendaFamilia, int membrosFamilia) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.rendaFamilia = rendaFamilia;
		this.membrosFamilia = membrosFamilia;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getRendaFamilia() {
		return rendaFamilia;
	}

	public void setRendaFamilia(int rendaFamilia) {
		this.rendaFamilia = rendaFamilia;
	}

	public int getMembrosFamilia() {
		return membrosFamilia;
	}
	public void setMembrosFamilia(int membrosFamilia) {
		this.membrosFamilia = membrosFamilia;
	}

	@Override
	public String toString() {
		return "Pessoa \n[identificador: " + id + "\n Nome:" + nome + "\n e-mail: " + email + "\n Renda Familia: " + rendaFamilia
				+ "\n Membros da Familia:" + membrosFamilia + "]";
	}

	
}







