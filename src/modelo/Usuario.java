package modelo;
import java.io.Serializable;

public class Usuario implements Serializable{
	private static final long serialVersionUID=1L;
	private String user;
	private String pswd;
	
	public Usuario(String user, String pswd) {
		super();
		this.user = user;
		this.pswd = pswd;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	
}
