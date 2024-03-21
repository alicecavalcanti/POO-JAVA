package br.com.unit.aula13;

public class AppPessoa {
	public static void main(String[] args) {

		Pessoa pessoa = null;
		pessoa = new Pessoa(1, "Maria do Carmo", "carminha@email.com", 3000, 3);
		
		int rendaPorPessoa = 0;
		try {
			rendaPorPessoa = pessoa.getRendaFamilia() / pessoa.getMembrosFamilia();		
		}
		catch (NullPointerException erro) {
			System.out.println("Nenhum usuário foi criado");
			return;
		}
		catch (ArithmeticException erro) {
			pessoa.setMembrosFamilia(1);
			rendaPorPessoa = pessoa.getRendaFamilia() / pessoa.getMembrosFamilia();		
			System.out.println("Foi informado 0 membros na família. O sistema assumiu 1");
		}
		System.out.println(pessoa.toString());		
		System.out.printf("\nRenda por pessoa: %d", rendaPorPessoa);			

		
	}

}