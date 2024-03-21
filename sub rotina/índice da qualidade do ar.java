/******************************************************************************

O Índice de Qualidade do Ar (IQA) é classificado pela tabela 1 e os efeitos sobre a saúde da 
população segue a tabela2 (fonte: cprh.pe.gov.br)
Problema: Conscientização da população para a necessidade de cuidados com a qualidade do ar. 
Requisitos: Como gestor da secretaria de meio ambiente eu gostaria de um programa para ler o IQA 
e mostrar a classificação do ar e efeito sobre a população corresponde ao índice recebido

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String classificacaoAr= null, efeitosAr = null;
	    
		System.out.println("Fale o Índice de Qualidade do Ar (IQA): ");
		int indiceAr = scanner.nextInt();
		
		System.out.println("A classificação do ar é:  \n" + classificacao(indiceAr, classificacaoAr));
		
		System.out.println("O efeito desse índice sobre a população é:\n" + efeitos(indiceAr, efeitosAr)) ;
		
		
	}
	
	public static String classificacao (int indiceAr, String classificacaoAr){
	    
	    if(0 <= indiceAr&& indiceAr <= 50){
	        classificacaoAr = "Boa";
	    }else if(51<= indiceAr && indiceAr <= 100){
	        classificacaoAr = "Regular";
	        
	    }else if(101 <= indiceAr && indiceAr <= 199){
	        classificacaoAr = "Inadequada";
	        
	    }else if(200 <= indiceAr && indiceAr <= 299){
	        classificacaoAr = "Má";
	        
	    }else if(300 <= indiceAr && indiceAr <= 399 ){
	        classificacaoAr = "Péssima";
	        
	    }else{
	        classificacaoAr = "crítica";
	    }
	    
	    return classificacaoAr;
	}
	
	public static String efeitos ( int indiceAr, String efeitosAr){
    	   if(0 <= indiceAr && indiceAr <= 100){
    	       efeitosAr = "Ausência de sintomas.";
    	   }else if (101 <= indiceAr && indiceAr <= 199){
    	       efeitosAr = "Leve agravamento dos sintomas de pessoas susceptíveis, ...";
    	   }else if (200 <= indiceAr && indiceAr <= 299){
    	       efeitosAr = "Decréscimo da resistência física e significativo agravamento, ...";
    	   }else if (300 <= indiceAr && indiceAr <= 399){
    	       efeitosAr = "Aparecimento prematuro de certas doenças, ...";
    	   
    	   }else {
    	       efeitosAr = "Morte prematura de pessoas doentes e pessoas idosas ...";
    	   }
    	   
    	   return efeitosAr;
	}
}

