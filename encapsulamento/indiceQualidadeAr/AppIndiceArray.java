package aula06;

import java.util.Iterator;
import java.util.Scanner;

public class AppIndiceArray {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		IndiceQualidadeAr[] iqrArray = new IndiceQualidadeAr[3];
		
		
		for (int i = 0; i < iqrArray.length; i++) {
			System.out.printf("Índice do %dº dia: ", (i+1));
			double indice = input.nextDouble();	
			
			IndiceQualidadeAr iqr = new IndiceQualidadeAr(indice);
			iqrArray[i]=iqr;
			System.out.println("Indice ......: "+ iqrArray[i].getIndice());
			System.out.println("Classificação: "+ iqrArray[i].getClassificacao());
			System.out.println("Efeitos .....: "+ iqrArray[i].getEfeitos());
		}
		
		for (int i = 1; i < iqrArray.length; i++) {
			double diferenca = iqrArray[i].compararIndice(iqrArray[i-1].getIndice());
			System.out.printf("\nDiferença dia %d em relação ao dia anterior: %.1f  ", (i+1), diferenca);
			if(diferenca > 0) {
				System.out.print("A qualidade do ar piorou");
			}
			else if(diferenca < 0) {
				System.out.print("A qualidade do ar melhorou");
			}
			else {
				System.out.print("A qualidade do ar se mantém estável");
			}
		}
		
		
		

	}

}
