package Client;

public class Pasaje {
	int idtren;
	int carga;
	long valorpasaje;
	String categoria;

	public Pasaje(int idtren, String categoria, long valorpasaje, int carga) {
		super();
		this.idtren = idtren;
		this.categoria = categoria;
		this.valorpasaje = valorpasaje;
		this.carga = carga;
	}

	public int getIdtren() {
		return idtren;
	}

	public String getCategoria() {
		return categoria;
	}

	public long getValorpasaje() {
		return valorpasaje;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return "Pasaje [idtren=" + idtren + ", carga=" + carga + ", valorpasaje=" + valorpasaje + ", categoria="
				+ categoria + "]";
	}

}
