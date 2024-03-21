public class Main
{
	public static void main(String[] args) {
	    
	    final double PERC_FREQ_APROVACAO = 25;
	    final double MEDIA_APROVACAO = 6;
	    
	    // Entradas
	    
	    double nota1 = 2;
	    double nota2 = 5;
	    int totalAulas = 60;
	    int faltas = 50;
	    
	    
	    // Processamento
	    
	    double media = (nota1 + nota2) / 2;
	    double percFaltas = (double) faltas/totalAulas*100;

        String situacao;
	    if (media>=MEDIA_APROVACAO && percFaltas<=PERC_FREQ_APROVACAO) {
	        situacao = "Aprovado";
	    }
	    else if (percFaltas>PERC_FREQ_APROVACAO && media>=MEDIA_APROVACAO) {
	        situacao = "Reprovado por faltas";
	    }
	    else if (media<MEDIA_APROVACAO && percFaltas<PERC_FREQ_APROVACAO) {
	        situacao = "Reprovado por média";
	    }
	    else {
	        situacao = "Reprovado por média e por falta";
	    }
	    
	    
	    // Saida
	    System.out.printf("Média: %.1f\n", media);
	    System.out.printf("%% faltas: %.1f\n", percFaltas);
	    System.out.printf("Situação: %s", situacao);
	   


	    
	    
		
	}
}

