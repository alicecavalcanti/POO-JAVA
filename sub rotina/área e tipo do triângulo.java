import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1º lado: ");
        double lado1 = input.nextDouble();

        System.out.print("2º lado: ");
        double lado2 = input.nextDouble();

        System.out.print("3º lado: ");
        double lado3 = input.nextDouble();

        System.out.printf("Área do triangulo: %.3f\n", calculaAreaTriangulo(lado1, lado2, lado3) ); 

        System.out.printf("Tipo do triangulo: %s", defineTipoTriangulo(lado1, lado2, lado3));

        input.close();
	}
	
	public static double calculaAreaTriangulo (double ladoA, double ladoB, double ladoC) {
        double semiPerimetro = (ladoA+ladoB+ladoC)/2;
        
        double area = Math.sqrt(semiPerimetro *
                               (semiPerimetro-ladoA) *
                               (semiPerimetro-ladoB) *
                               (semiPerimetro-ladoC));	
	    return area;
	}
	

	public static String defineTipoTriangulo (double ladoA, double ladoB, double ladoC){

        if (ladoA==ladoB && ladoA==ladoC) {
            return "Equilátero";
        }
        else if (ladoA!=ladoB && ladoB!=ladoC && ladoA!=ladoC){
            return "Escaleno";
        }
        else {
            return "Isóceles";
        }
	}

	
}