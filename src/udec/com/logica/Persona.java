package udec.com.logica;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int cedula;
	
	public Persona(int _cedula, String _nombre , String _apellido) {
		nombre = _nombre;
		apellido = _apellido;
		cedula=_cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

}
