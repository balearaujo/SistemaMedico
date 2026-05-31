package modelo;

public class Odontologo extends Usuario{
	public Odontologo(String user, String pswd) {
		super (user, pswd);
		
	}
	@Override
	public String getTipodeUsuario() {
		return "Doctor";
	}
}


