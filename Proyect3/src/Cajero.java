import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Cajero extends Remote {
	public float consignar() throws RemoteException;

	public float consultar() throws RemoteException;

	public float retirar() throws RemoteException;
}
