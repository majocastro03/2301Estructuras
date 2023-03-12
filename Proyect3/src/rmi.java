import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.rmi.*;
public class rmi extends UnicastRemoteObject implements Cajero{
	public rmi() throws RemoteException{
		int inicial = 10000;
		int opcion;
		float ingreso, retiro;
		ArrayList<Usuario> alUsuarios = new ArrayList<Usuario>();
	}
	public float consignar() throws RemoteException{
		float actual = 0;
		return actual;
	}

	public float consultar() throws RemoteException{
		float actual = 0;
		return actual;
	}

	public float retirar() throws RemoteException{
		float actual = 0;
		return actual;
	}
}
