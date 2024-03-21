package aula11;

import java.util.List;

public class Apuracao {
	
	public static void contarVotos(Urna urna, List<Candidato> candidatos) throws EmptyListException {

		if ( urna.getVotos().size() == 0 ) {
			throw new EmptyListException();
		}

		for(int votoDado : urna.getVotos()) {
			for(Candidato c: candidatos) {
				if (c.getNumero() == votoDado) {
					c.receberVoto();
				}
			}
		}
	}

}