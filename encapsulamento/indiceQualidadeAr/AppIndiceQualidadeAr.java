package aula06;
import java.util.Scanner;

public class AppIndiceQualidadeAr {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o indice atual para saber a classificação e efeitos do ar: ");
		int indice = input.nextInt();
		
		IndiceQualidadeAr iqr = new IndiceQualidadeAr(indice);
		iqr.defineClassificacao();
		iqr.defineEfeitos();
		
		
		System.out.println("Indice ........ : "+ iqr.getIndice());
		System.out.println("Classificação...... : "+ iqr.getClassificacao());
		System.out.println("Efeitos ........ : "+ iqr.getEfeitos());
		
		System.out.println("Indice anterior: ");
		int indiceAnterior = input.nextInt();
		double diferencaIndice = iqr.compararIndice(indiceAnterior);
		
		System.out.println("Diferença dos índices: " + diferencaIndice);
		
		if(diferencaIndice > 0) {
			System.out.println("A qualidade do ar piorou");
		}
		else if(diferencaIndice < 0) {
			System.out.println("A qualidade do ar melhorou");
		}
		else {
			System.out.println("A qualidade do ar se mantém estável");
		}	
	}
}
