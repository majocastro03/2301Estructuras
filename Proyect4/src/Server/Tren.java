package Server;
//NO LA TOQUE TAMPOCO
import ListaSimple.*;

public class Tren {
	LinkedList<Vagon> Vagones = new LinkedList<Vagon>();
	int idtren;

	
	public Tren(LinkedList<Vagon> vagones, int idtren) {
		super();
		Vagones = vagones;
		this.idtren = idtren;
	}

	public int getIdtren() {
		return idtren;
	}

	public void setIdtren(int idtren) {
		this.idtren = idtren;
	}

	public LinkedList<Vagon> getVagones() {
		return Vagones;
	}

	public void setVagones(LinkedList<Vagon> vagones) {
		Vagones = vagones;
	}

	@Override
	public String toString() {
		return "Tren [Vagones=" + Vagones + ", idtren=" + idtren + "]";
	}
	public void addVagon(Vagon vagon) {
		LinkedList<Vagon> Vagones = new LinkedList<Vagon>();
		Vagones.add(vagon);
	}
}
