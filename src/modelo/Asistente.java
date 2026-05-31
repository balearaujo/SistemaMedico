package modelo;

public class Asistente extends Usuario{
	public Asistente (String user, String pswd) {
		super (user, pswd);
		
	}
	@Override
	public String getTipodeUsuario() {
		return "Asistente";
	}
}




