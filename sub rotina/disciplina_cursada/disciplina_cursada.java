package aula05;

public class DisciplinaCursada {

	double nota1;
	double nota2;
	double media;
	int faltas;
	double percentualFaltas;
	int totalAulas;
	String situacao;
	
	double calculaMediaNotas(){
	    return (nota1 + nota2) / 2;
	}


	double calculaPercentualFaltas(){
	    double percFaltas = (double) faltas/totalAulas*100;
	    return percFaltas;
	}

	
	String defineSituacao() {
	    final double PERC_FREQ_APROVACAO = 25;
	    final double MEDIA_APROVACAO = 6;
	    String situacao;
	    if (media>=MEDIA_APROVACAO && percentualFaltas<=PERC_FREQ_APROVACAO) {
	        situacao = "Aprovado";
	    }
	    else if (percentualFaltas>PERC_FREQ_APROVACAO && media>=MEDIA_APROVACAO) {
	        situacao = "Reprovado por faltas";
	    }
	    else if (media<MEDIA_APROVACAO && percentualFaltas<PERC_FREQ_APROVACAO) {
	        situacao = "Reprovado por média";
	    }
	    else {
	        situacao = "Reprovado por média e por falta";
	    }	
	    return situacao;
	}
}