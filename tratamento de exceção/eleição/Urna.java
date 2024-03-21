package br.com.unit.aula13;

import java.util.ArrayList;
import java.util.List;

public class Urna {
	private int secao;
	private List<Integer> votos;

	public Urna(int secao) {
		this.secao = secao;
		this.votos = new ArrayList();
	}

	public int getSecao() {
		return secao;
	}

	public List<Integer> getVotos() {
		return votos;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}

	public void receberVoto(int voto) {
		this.votos.add(voto);
	}	

	public void ordenar() {
		votos.sort(null);
	}

	public int primeiro() throws IndexOutOfBoundsException {
		return votos.get(0);			
	}
}
