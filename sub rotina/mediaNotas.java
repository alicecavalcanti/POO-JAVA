import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    // Entradas
	    double nota1;
	    do {
	        System.out.println("Digite uma nota: ");
	        nota1 = input.nextDouble();
	        if (nota1<0 || nota1>10) {
	            System.out.println("Nota inválida");  
	        }
	    } while(nota1<0 || nota1>10);
	    
	    double nota2 = 5;
	    int totalAulas = 60;
	    int faltas = 50;
	    
	    // Chamadas a quem sabe processar
        double media = calculaMediaNotas(nota1, nota2);
        double percFaltas = calculaPercentualFrequencia(faltas, totalAulas);
        String situacao = defineSituacao(media, percFaltas);
	    
	    // Saida
	    System.out.printf("Média: %.1f\n", media);
	    System.out.printf("%% faltas: %.1f\n", percFaltas);
	    System.out.printf("Situação: %s", situacao);
	}
	
	
	public static double calculaMediaNotas(double nota1, double nota2){
	    return (nota1 + nota2) / 2;
	}


	
	public static double calculaPercentualFrequencia(int faltas, int totalAulas){
	    double percFaltas = (double) faltas/totalAulas*100;
	    return percFaltas;
	}


	
	public static String defineSituacao(double media, double percFaltas) {
	    final double PERC_FREQ_APROVACAO = 25;
	    final double MEDIA_APROVACAO = 6;
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
	    return situacao;
	}
	
	
	
	
}