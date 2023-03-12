package client;

import interfaces.RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    private RMI service;
    private String ip;
    private String port;
    private String serviceName;
    private String url;

    public Client(String ip, String port, String serviceName) {
        this.service = null;
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }

    public float consignar() throws RemoteException {
        try{
            service = (RMI) Naming.lookup(url);
            return service.consignar();
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public float retirar() throws RemoteException {
        try{
            service = (RMI) Naming.lookup(url);
            return service.retirar();
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public float consultar() throws RemoteException {
        try{
            service = (RMI) Naming.lookup(url);
            return service.consultar();
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void add(User user) throws RemoteException {
        try{
            service = (RMI) Naming.lookup(url);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }

}
