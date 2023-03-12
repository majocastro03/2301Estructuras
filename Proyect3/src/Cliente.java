import javax.swing.JOptionPane;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
	public static void main(String[] args) {
		try {
			Registry registro = LocateRegistry.getRegistry("localhost", 1099);
			Cajero c = (Cajero) Naming.lookup("//192.168.32.1/Cajero");
			int opcion;
			Transacciones cajero = new Transacciones();
			cajero.addUsuario(new Usuario(Integer.parseInt(JOptionPane.showInputDialog("Identificacion")),
					Integer.parseInt(JOptionPane.showInputDialog("Contraseña"))));
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Indique por favor la accion que desea realizar. \n 1. Consignar dinero. \n 2. Consultar saldo. \n 3. Retirar dinero"));

			switch (opcion) {
			case 1: {
				cajero.consignar();
				break;
			}
			case 2: {
				cajero.consultar();
				break;
			}
			case 3: {
				cajero.retirar();
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
