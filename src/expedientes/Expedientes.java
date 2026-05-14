package expedientes;
import java.io.Serializable;

public class Expedientes {
	private static final long serialVersionUID=1L;
	private String estomatologo;
	private String Nombre;
	private int edad;
	private char sexo;
	private int altura;
	private int peso;
	private String alergias;
	private char enfermedad;
	private String CualEnfermedad;
	private String Sangre;
	private String Padecimiento;
	private String Fecha;
	private String domicilio;
	private String telefono;
	
	public Expedientes(String estomatologo, String nombre, int edad, char sexo, int altura, int peso, String alergias,
			char enfermedad, String cualEnfermedad, String sangre, String padecimiento, String fecha, String domicilio,
			String telefono) {
		super();
		this.estomatologo = estomatologo;
		Nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.alergias = alergias;
		this.enfermedad = enfermedad;
		CualEnfermedad = cualEnfermedad;
		Sangre = sangre;
		Padecimiento = padecimiento;
		Fecha = fecha;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}

	public String getEstomatologo() {
		return estomatologo;
	}

	public void setEstomatologo(String estomatologo) {
		this.estomatologo = estomatologo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public char getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(char enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getCualEnfermedad() {
		return CualEnfermedad;
	}

	public void setCualEnfermedad(String cualEnfermedad) {
		CualEnfermedad = cualEnfermedad;
	}

	public String getSangre() {
		return Sangre;
	}

	public void setSangre(String sangre) {
		Sangre = sangre;
	}

	public String getPadecimiento() {
		return Padecimiento;
	}

	public void setPadecimiento(String padecimiento) {
		Padecimiento = padecimiento;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
			
}
