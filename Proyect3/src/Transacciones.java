import java.util.ArrayList;

import javax.swing.JOptionPane;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.rmi.*;

public class Transacciones extends UnicastRemoteObject implements Cajero {
	protected Transacciones() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public float consignar() {
		float ingreso, actual;
		int inicial = 20000;
		ingreso = Integer.parseInt(JOptionPane.showInputDialog("¿Que valor desea consignar?"));
		actual = inicial + ingreso;
		JOptionPane.showConfirmDialog(null, "El saldo actual de su cuenta es" + actual);
		return actual;
	}

	public float retirar() {
		float retiro, actual = 0;
		int inicial = 200000;
		retiro = Float.parseFloat(JOptionPane.showInputDialog("¿De que valor es el retiro que va a realizar?"));
		if (retiro > inicial) {
			JOptionPane.showConfirmDialog(null,
					"Lo sentimos, no cuenta con el saldo suficiente para el valor del retiro");
		} else {
			actual = inicial - retiro;
			JOptionPane.showConfirmDialog(null, "El saldo actual de su cuenta es" + actual);
		}
		return actual;
	}

	public float consultar() {
		float actual = 20000;
		JOptionPane.showConfirmDialog(null, "El saldo actual de su cuenta es" + actual);
		return actual;
	}

	public void addUsuario(Usuario usuario) {
		ArrayList<Usuario> alUsuarios = new ArrayList<Usuario>();
		alUsuarios.add(usuario);
	}
}
