
public class Usuario {
	private int identificacion;
	private int contraseña;

	public Usuario(int identificacion, int contraseña) {
		super();
		this.identificacion = identificacion;
		this.contraseña = contraseña;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

	public int getContraseña() {
		return contraseña;
	}

}
