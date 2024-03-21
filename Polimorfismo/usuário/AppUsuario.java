package aula10;

public class AppUsuario {

	public static void main(String[] args) {
	
		Usuario usuario1 = new Usuario("Jose", "123", 3, "81999998888");
		System.out.println(usuario1.toString());

		Usuario usuario2 = new Usuario("Maria", "321", 2, "81888887777");
		System.out.println(usuario2);
	
		Usuario usuario3 = new Usuario("Carlos", "123", 1, "81444443333");
		System.out.println(usuario3);
	
		usuario3=null;
		usuario3 = new Usuario("Italo", "543", 1, "81111112222");
		System.out.println(usuario3);
	
		
	}


}
