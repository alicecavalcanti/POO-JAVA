package br.com.unit.aula13;

import java.util.Scanner;

public class AppExcecao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero=0;
		do {
			try {
				System.out.print("Número: ");
				numero = input.nextInt();
				
				if (numero == 0) {
					throw new Exception("O número não pode ser Zero");

				}
				
			}
			catch(Exception erro) {
				System.out.println("O dado digitado não é um número inteiro");
				input.nextLine();
				continue;
			}
			break;
		} while (true);
		
		
		
		System.out.println("O número dividido é: " + numero/2);
		
		
		
	}

}
