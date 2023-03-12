package Server;
//NO LA TOQUE, YA SIRVE
public class Contacto {
	String nombre, apellidos, personacontacto;
	String direccion;
	long telefono;

	public Contacto(String nombre, String apellidos, String personacontacto, String direccion, long telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.personacontacto = personacontacto;
		this.direccion = direccion;
		this.telefono = telefono;

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getPersonacontacto() {
		return personacontacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", personacontacto=" + personacontacto
				+ ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}

}
