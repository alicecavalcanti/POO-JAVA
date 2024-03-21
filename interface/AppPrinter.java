package simulado.up2a;

public class AppPrinter {

	public static void main(String[] args) {

		ImpressoraJatoTinta jato = new ImpressoraJatoTinta("DeskJet 2000", 5);
		jato.ligaDesliga();
		try {
			System.out.println(jato.alinharCartuchos());			
		}
		catch(PrinterTurnedOff erro) {
			System.out.println(erro.toString());
			System.out.println("Impressora desligada");
		}
	}
}




