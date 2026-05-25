package expedientes;
import java.io.Serializable;

public class Cita implements Serializable {
	private static final long serialVersionUID=1L;
	private int dia;
	private int mes;
	private int anio;
	private String hora;
	
	public Cita(int dia, int mes, int anio, String hora) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		this.hora=hora;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	public String getHora() {
		return hora;
	}
}
