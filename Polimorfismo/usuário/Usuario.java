package aula10;

public class Usuario {
	
	static private int ultimoId=0;
	
	private int idUsuario;
	private String login;
	private String senha;
	private int nivel;
	private String telefone;
	
	public Usuario(String login, String senha, int nivel, String telefone) {
		super();
		ultimoId++;
		this.idUsuario=ultimoId;
		this.login = login;
		this.senha = senha;
		this.nivel = nivel;
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	@Override
	public String toString() {
		return "\nUsuario:\nidUsuario: " + idUsuario +
			   "\nlogin=" + login +
			   "\nnivel=" + nivel +
			   "\ntelefone=" + telefone;
	}

	
}
