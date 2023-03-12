package Server;
//NO LA TOQUE, YA SIRVE 
public class Pasajero {
	String nombre;
	String apellido;
	String identificacion;
	long id;
	String direccion;
	long telefono;

	public Pasajero(String nombre, String apellido, String identificacion, long id, String direccion, long telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.id = id;
		this.direccion = direccion;
		this.telefono = telefono;

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public long getId() {
		return id;
	}

	public String getDireccion() {
		return direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", id="
				+ id + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}

}
