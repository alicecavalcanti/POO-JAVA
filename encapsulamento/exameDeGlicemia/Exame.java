package aula07;

public class Exame {
    
	private int numeroExame;
	private String nomePaciente;
	private double nivelGlicose;
	
	//Declarando classe construtora:
	public Exame(int numeroExame, String nomePaciente, double nivelGlicose) {
		this.numeroExame = numeroExame;
		this.nomePaciente = nomePaciente;
		this.nivelGlicose = nivelGlicose;
	}
	
	//Declarando métodos acessores / getting:
	public int getNumeroExame() {
		return numeroExame;
	}
	
	public String getNomePaciente() {
		return nomePaciente;
	}
	
	public double getNivelGlicose() {
		return nivelGlicose;
	}
	
	//Declarando métodos modificadores / setting:

	
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public void setNivelGlicose(double nivelGlicose) {
		this.nivelGlicose = nivelGlicose;
	}
	
	//Declarando outros métodos:
	public String defineDiagnostico() {
		if(nivelGlicose <= 99) {
			return "Normal";
		}
		else if(nivelGlicose <= 125) {
			return "Pré-diabetes";
		}
		else {
			return "Diabetes";
		}	
	}
}