package aula07;

import java.util.Scanner;

public class AppExameArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Exame[] exameArray = new Exame[3];
		
		for(int i = 0; i < exameArray.length; i++) {
			System.out.printf("Digite o número do exame %dº do paciente: " , (i+1));
			int numeroExame = input.nextInt();
			
			input.nextLine();
			System.out.print("Digite o nome do paciente................: ");
			String nomePaciente = input.nextLine();
		
			System.out.print("Digite o nivel de glicose................: ");
			double nivelGlicose = input.nextDouble();
			
			Exame exame = new Exame(numeroExame, nomePaciente, nivelGlicose);
			exameArray[i] = exame;
			
			//Saída de dados:
			System.out.println("Número..........: " +exame.getNumeroExame());
			System.out.println("Nome............: " +exame.getNomePaciente());
			System.out.println("Nível de glicose: " +exame.getNivelGlicose());
			System.out.println("Diagnostico.....: " +exame.defineDiagnostico());
		}
		
		input.close();
	}
}

