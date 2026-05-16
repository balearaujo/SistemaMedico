package expedientes;
import java.io.Serializable;

public class Cita implements Serializable {
	private static final long serialVersionUID=1L;
	private int dia;
	private int mes;
	private int anio;
	
	public Cita(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
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
}
