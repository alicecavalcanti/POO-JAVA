package fonteAgua;

public class Produtos {
	String descricao;
	double precoCusto;
	int codigo;
	int estoque;

	public void entradaProdutos(int quantEntradaProdutos){
		estoque += quantEntradaProdutos;
	}
	public boolean saidaProduto(int quantSaidaProdutos){
	  if(estoque < quantSaidaProdutos){
	     return false;
	  }else{
	     estoque -= quantSaidaProdutos;
	     return true;
	  }
	}
}
