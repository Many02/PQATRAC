package usuarios;

public abstract class Usuario implements Autenticable {
	protected String id,nombre,login,password;

	public Usuario(String id, String nombre, String login, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.login = login;
		this.password = password;
	}

	@Override
	public boolean autenticar(String login, String password) {
		// TODO Auto-generated method stub
		if  (login == this.login && password == this.password) {
			return true;
		}
		return false;
	} 

}
