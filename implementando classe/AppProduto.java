package fonteAgua;

public class AppProduto {

	public static void main(String[] args) {
		Produtos novoProduto = new Produtos();
		novoProduto.descricao = "Água com gás - cristal";
		novoProduto.precoCusto = 2.0;
		novoProduto.codigo = 001;
		novoProduto.estoque = 0;
		novoProduto.entradaProdutos(1000);
		novoProduto.entradaProdutos(2000);
		
		if(novoProduto.saidaProduto(2500) == false) {;
			System.out.println("Estoque insuficiênte");
		}
		
		if(novoProduto.saidaProduto(1000) == false) { ;
			System.out.println("Estoque insuficiênte");
		}
	
		System.out.println("Descrição: " + novoProduto.descricao);
		System.out.println("Preço de custo: " + novoProduto.precoCusto);
		System.out.println("Código: " + novoProduto.codigo);
		System.out.println("Estoque: " + novoProduto.estoque);
	}

}

