package aula13;

import java.util.InputMismatchException;
import java.util.Scanner;
public class AppConsumo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valorConsumo;
		do {
			try {
				System.out.print("Valor do consumo: ");
				valorConsumo = Double.parseDouble(input.nextLine());			
			}
			catch (NumberFormatException erro) {
				System.out.println("Valor deve ser numérico");
				continue;
			}
			break;
		} while (true);
		
		char tipoCliente;
		do {
			System.out.println("Tipo do cliente [A/F/P]: ");
			tipoCliente = input.nextLine().charAt(0);
			tipoCliente = Character.toUpperCase(tipoCliente);
			if (tipoCliente!='A' && tipoCliente!='F' && tipoCliente!='P') {
				System.out.println("Tipo incorreto");
				continue;
			}
			break;
		} while (true);
		
		
		if (tipoCliente == 'P') {
			Consumo consumo = new Consumo(valorConsumo);
			System.out.println(consumo);
		}
		else {
			Consumo consumo = new Consumo(valorConsumo, tipoCliente);
			System.out.println(consumo);
		}

	}

}
