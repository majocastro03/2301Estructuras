package Server;

import ListaSimple.LinkedList;

//TAMPOCO TOCAR

public class Vagon {
	boolean tipo;
	LinkedList<Pasajero> pasajeros = new LinkedList<Pasajero>();
	public Vagon(boolean tipo, LinkedList<Pasajero> pasajeros) {
		super();
		this.tipo = tipo;
		this.pasajeros = pasajeros;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	@Override
	public String toString() {
		return "Vagon [tipo=" + tipo + ", pasajeros=" + pasajeros + "]";
	}
	public void addPasajero(Pasajero pasajero) {
		LinkedList<Pasajero> pasajeros = new LinkedList<Pasajero>();
		pasajeros.add(pasajero);
	}
}
