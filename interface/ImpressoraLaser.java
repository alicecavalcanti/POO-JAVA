package simulado.up2a;

public class ImpressoraLaser extends Impressora{
	
	private char tipo;
	private int temperatura;
	
	public ImpressoraLaser(String modelo, char tipo) {
		super(modelo);
		this.tipo = tipo;
		this.temperatura = 0;
	}

	public void ajustarTemperatura(int temp){
		this.temperatura = temp;		
	}
	
	@Override
	public void ligaDesliga(){
		this.ligada = !this.ligada;
		if (this.ligada==true) {
			this.ajustarTemperatura(30);
		}
		else {
			this.ajustarTemperatura(0);
		}
	}
}





