package client;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Client client = new Client("localhost", "3000", "service");
		try {

			int opcion;
			String nombreDeUsuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
			String contraseña = JOptionPane.showInputDialog("Ingrese identificacion");
			client.add(new User(nombreDeUsuario, contraseña));
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Indique por favor la accion que desea realizar. \n 1. Consignar dinero. \n 2. Consultar saldo. \n 3. Retirar dinero"));

			switch (opcion) {
			case 1: {
				client.consignar();
				break;
			}
			case 2: {
				client.consultar();
				break;
			}
			case 3: {
				client.retirar();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} catch (Exception e) {
			JOptionPane.showInputDialog("Servidor no conectado" + e);
		}

	}
}
