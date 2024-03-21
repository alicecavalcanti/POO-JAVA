package br.com.unit.aula13;

public class EmptyListException extends Exception{
	@Override
	public String getMessage() {
		return "A lista está vazia";
	}
}
