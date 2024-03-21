package aula06;

public class IndiceQualidadeAr {
	
	private double indice;
	private String classificacao;
	private String efeitos;
	
	public IndiceQualidadeAr(double indice) {
		this.indice = indice;
	}

	public double getIndice() {
		return indice;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public String getEfeitos() {
		return efeitos;
	}

	public void defineClassificacao() {
		
		if(indice <= 50){
			this.classificacao = "Boa";
	    }
	    else if(indice <= 100){
	        
	        this.classificacao = "Regular";
	        
	    }
	    else if (indice < 200){
	        
	    	this.classificacao = "Indequada";
	        
	    }
	    else if(indice < 300){
	        
	    	this.classificacao = "Má";
	    }
	    else if(indice < 400){
	        
	    	this.classificacao = "Péssima";
	    }
	    else{

	    	this.classificacao = "Crítica";
	    }
	}
	
	public void defineEfeitos() {
		if(indice <= 100){
	        
	        this.efeitos = "Ausência de sintomas.";
	    }
	    else if(indice < 200){
	        
	    	this.efeitos = "Leve agravamento dos sintomas de pessoas suspectivas...";
	    }
	    else if(indice < 300){
	        
	    	this.efeitos = "Decréscimo de resitência física e significativo agravamento...";
	    }
	    else if(indice < 400){
	    	
	    	this.efeitos = "Aparecimento prematuro de certas doenças...";
	    }
	    else{
	    	
	    	this.efeitos = "Morte prematura de pessoas doentes e pessoas idosas...";
	    }
	}
	
	public double compararIndice(double indiceAnterior) {
		return this.indice - indiceAnterior;
	}
}






