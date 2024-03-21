package aula07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppExameLista {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Exame[] exameArray = new Exame[3];
		List<Exame> exameLista = new ArrayList();
		
		do {
			System.out.printf("Digite o número do exame %dº do paciente: " , (exameLista.size()+1));
			int numeroExame = input.nextInt();
			if (numeroExame == 0) {
				break;
			}
			
			input.nextLine();
			System.out.print("Digite o nome do paciente................: ");
			String nomePaciente = input.nextLine();
		
			System.out.print("Digite o nivel de glicose................: ");
			double nivelGlicose = input.nextDouble();
			
			Exame exame = new Exame(numeroExame, nomePaciente, nivelGlicose);
			exameLista.add(exame);
			
		} while (true);
		
		System.out.println("==================================================");
		System.out.println("Número  Nome do paciente      Nivel  Diagostico");
		System.out.println("                             Glicose");
		System.out.println("==================================================");
		for(Exame  exame  : exameLista ) {
			System.out.printf("%6d  %-20s  %6.1f  %-20s\n", exame.getNumeroExame(),
							 exame.getNomePaciente(),
							 exame.getNivelGlicose(),
							 exame.defineDiagnostico());
		}
		System.out.println("\n==================================================");
		
	
		input.close();
	}
}
