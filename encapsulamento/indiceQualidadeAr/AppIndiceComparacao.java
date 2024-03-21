package aula06;

import java.util.Scanner;

public class AppIndiceComparacao {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Índice do primeiro dia: ");
		double indice = input.nextDouble();
		
		IndiceQualidadeAr iqr1 = new IndiceQualidadeAr(indice);
		System.out.println("Indice ......: "+ iqr1.getIndice());
		System.out.println("Classificação: "+ iqr1.getClassificacao());
		System.out.println("Efeitos .....: "+ iqr1.getEfeitos());

		
		System.out.print("\nÍndice do segundo dia: ");
		indice = input.nextDouble();
		
		IndiceQualidadeAr iqr2 = new IndiceQualidadeAr(indice);
		System.out.println("Indice ......: "+ iqr2.getIndice());
		System.out.println("Classificação: "+ iqr2.getClassificacao());
		System.out.println("Efeitos .....: "+ iqr2.getEfeitos());
		
		double diferencaIndice = iqr2.compararIndice(iqr1.getIndice());
		
		System.out.println("\nDiferença dos índices: " + diferencaIndice);
		
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

