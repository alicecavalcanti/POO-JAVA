package br.com.unit.aula13;

public class Candidato {
	private int numero;
	private String nome;
	private int votosObtidos;
	
	public Candidato(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.votosObtidos = 0;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getVotosObtidos() {
		return this.votosObtidos;
	}
	
	public void receberVoto() {
		this.votosObtidos++;
	}

}
