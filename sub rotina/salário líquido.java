import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite seu salário:");
	    double salarioBruto = scan.nextDouble();
	    
	    double salarioLiquido = calculaSalarioLiquido(salarioBruto);
	    String tipoDesconto = defineTipoDesconto(salarioBruto);
	    
	    System.out.printf("O seu salario liquido é:%.2f\n", salarioLiquido);
	    System.out.println("O seu tipo de desconto é:" + tipoDesconto);
	}


    public static double calculaSalarioLiquido(double salarioBruto){
	    double desconto = 0;
	    if(salarioBruto <= 2000){
	       desconto =  0;
	    }
	    else if(salarioBruto <= 4000){
	        desconto =  salarioBruto * 2.0/100;
	    }
	    else{
	        desconto =  salarioBruto * 4.0/100;
	        if(desconto > 400){
	            desconto = 400;
	        }
	    }
	    return salarioBruto-desconto;
	}
	
	public static String defineTipoDesconto(double salarioBruto){
	    if(salarioBruto <= 2000){
	       return "isento";
	    }
	    else if(salarioBruto <= 4000){
	       return "minimo";
	    }
	    else {
	        double desconto = salarioBruto * 4/100;
	        if (desconto<400) {
	            return "medio";
	        }
	        else {
	            return "maximo";
	        }
	    }
	}
}