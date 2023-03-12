package server;

import interfaces.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JOptionPane;

import client.User;

public class Service extends UnicastRemoteObject implements RMI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Service() throws RemoteException {
		head = null;
		size = 0;
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

	private Node head;
	private int size;

	public void add(User user) throws RemoteException {
		Node newNode = new Node(user);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
		size++;
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.getUser().toString());
			current = current.getNext();
		}
	}

	public int size() {
		return size;
	}

	private class Node {
		private User user;
		private Node next;

		public Node(User user) {
			this.user = user;
			this.next = null;
		}

		public User getUser() {
			return user;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

}
