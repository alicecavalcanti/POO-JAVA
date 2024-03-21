package simulado.up2a;

public abstract class Impressora implements IEquipamento{
	
	private static int ultimoId=0;
	
	private int id;
	private String modelo;
	protected boolean ligada;
	
	public Impressora(String modelo) {
		this.id=++ultimoId;
		this.modelo=modelo;
		this.ligada = false;
	}
}


