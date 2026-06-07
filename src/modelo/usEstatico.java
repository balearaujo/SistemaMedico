package modelo;

public class usEstatico {
	private static Usuario usuarioLogeado;
	
	public static void setUsuarioLogeado(Usuario u) {
		usuarioLogeado=u;
	}
	
	public static Usuario getUsuarioLogeado() {
		return usuarioLogeado;
	}
	
	public static void cerrarSesion() {
		usuarioLogeado=null;
	}
}
