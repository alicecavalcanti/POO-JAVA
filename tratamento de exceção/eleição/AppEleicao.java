package br.com.unit.aula13;

import java.util.ArrayList;
import java.util.List;

public class AppEleicao {
	public static void main(String[] args) {

		List<Candidato> listaCandidato = new ArrayList();
		int voto;
		
		Candidato c;
		c = new Candidato(650, "Vania");
		listaCandidato.add(c);
		c = new Candidato(750, "Yvson");
		listaCandidato.add(c);
		c = new Candidato(850, "Tadeu");
		listaCandidato.add(c);
		c = new Candidato(950, "Marcia");
		listaCandidato.add(c);

		Urna urna;
		urna = new Urna(1);
		
		urna.receberVoto(950);
		urna.receberVoto(850);
		urna.receberVoto(650);
		urna.receberVoto(950);
		
		int primeiro;
		try {
			primeiro = urna.primeiro();
			System.out.println("Primeiro voto: "+ primeiro);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Erro IndexOutOfBoundsException \n ao executar o método primeiro()" + e.hashCode());

		}
		
		try {
			Apuracao.contarVotos(urna, listaCandidato);		
		}
		catch (EmptyListException e) {
		    System.out.println("\nErro: Urna sem votação");
		    return;
		}

		System.out.println("Votos da urna (Ordem de votação): " + urna.getSecao());
		for (Integer votoAtual : urna.getVotos()) {
			System.out.println(votoAtual);
		}


		System.out.println("Votos da urna (Ordem numérica): " + urna.getSecao());
		urna.ordenar();
		for (Integer votoAtual : urna.getVotos()) {
			System.out.println(votoAtual);
		}
		
		
		for(Candidato cand: listaCandidato) {
			System.out.printf("\n%s - %d",cand.getNome(), cand.getVotosObtidos());
			
		}
		
	}

}
