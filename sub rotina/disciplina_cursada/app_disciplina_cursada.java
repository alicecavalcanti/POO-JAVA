package aula05;

public class AppLancamentoNotasFaltas {

	public static void main(String[] args) {
		
		DisciplinaCursada dc = new DisciplinaCursada();
		
		dc.nota1 = 8.7;
		dc.nota2 = 5;
		dc.faltas = 10;
		dc.totalAulas = 60;
		
		dc.media = dc.calculaMediaNotas();
		dc.percentualFaltas = dc.calculaPercentualFaltas();
		dc.situacao = dc.defineSituacao();
		
		System.out.println("1ª Nota.........: " + dc.nota1);
		System.out.println("2ª Nota.........: " + dc.nota2);
		System.out.println("Média...........: " + dc.media);
		System.out.println("Total de aulas..: " + dc.totalAulas);
		System.out.println("Quant. de faltas: " + dc.faltas);
		System.out.println("Perc. de faltas.: " + dc.percentualFaltas);
		System.out.println("Situação........: " + dc.situacao);

	}

}