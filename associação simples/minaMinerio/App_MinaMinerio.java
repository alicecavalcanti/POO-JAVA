package minaMinerio;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App_MinaMinerio {
	public static void main(String[] args) throws ParseException {
	
	// Definindo o formato da data
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	// Estanciando um objeto da classe Minerio
	Minerio minerio = new Minerio(1, "Ferro");
	
	// Estanciando um objeto da classe Mina
	Date dataFundacao = formato.parse("05/01/2007"); // Converte para data
	Mina mina = new Mina(10, minerio, dataFundacao);
	
	// chamando métodos da classe Mina
	mina.producao(1000);
	mina.escoamento(800);
	
	// Mostrando dados do objeto mina
	System.out.println("Id mina: " + mina.getIdMina());
	System.out.println("Minério: " + mina.getMinerio().getDescricao());
	String dtFundacao = formato.format(mina.getDataFundacao());
	System.out.println("Data de fundação: " + dtFundacao);
	System.out.println("Estoque: "+ mina.getEstoque());
	}
}
