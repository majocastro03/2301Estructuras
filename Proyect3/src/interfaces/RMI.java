package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import client.User;

public interface RMI extends Remote {
	public float consignar() throws RemoteException;

	public float consultar() throws RemoteException;

	public float retirar() throws RemoteException;
	
	public void add(User user) throws RemoteException;
}
