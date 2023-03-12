package Server;

//ESTA MENOS, DEJELA ASÍ

public class Ruta {
	Tren tren;
	String LugarSalida;
	String LugarLlegada;
	String horaSalida;
	String horaLlegada;

	public Ruta(Tren tren, String lugarSalida, String lugarLlegada, String horaSalida, String horaLlegada) {
		super();
		this.tren = tren;
		LugarSalida = lugarSalida;
		LugarLlegada = lugarLlegada;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Tren getTren() {
		return tren;
	}

	public void setTren(Tren tren) {
		this.tren = tren;
	}

	public String getLugarSalida() {
		return LugarSalida;
	}

	public void setLugarSalida(String lugarSalida) {
		LugarSalida = lugarSalida;
	}

	public String getLugarLlegada() {
		return LugarLlegada;
	}

	public void setLugarLlegada(String lugarLlegada) {
		LugarLlegada = lugarLlegada;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	@Override
	public String toString() {
		return "Ruta [Lugar de Salida=" + LugarSalida + ", Lugar de Llegada=" + LugarLlegada + ", Hora de Salida=" + horaSalida
				+ ", Hora de Llegada=" + horaLlegada + "]";
	}

	

}
