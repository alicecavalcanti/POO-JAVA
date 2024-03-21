package simulado.up2a;

public class ImpressoraJatoTinta extends Impressora{

	private int numCartuchos;
	private boolean cartuchosAlinhados;

	public ImpressoraJatoTinta(String modelo, int numCartuchos) {
		super(modelo);
		this.numCartuchos = numCartuchos;
	}
	
	public String alinharCartuchos() throws PrinterTurnedOff{
		if (!this.ligada) {
			throw new PrinterTurnedOff();
		}
		this.cartuchosAlinhados=true;
		return "Cartucho alinhado";
	}

	@Override
	public void ligaDesliga() {
		this.ligada = !this.ligada;	
	}
}








