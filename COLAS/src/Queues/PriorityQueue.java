package Queues;

import java.util.Iterator;

public class PriorityQueue extends QueueArray implements InterfaceQueue {

	public PriorityQueue(int prioridades) {
		super(prioridades);
		for (int i = 0; i < array.length; i++) {
			array[i] = new QueueList();
		}
	}

	public void clear() {
		for (int i = 0; i < array.length; i++) {
			array[i] = new QueueList();
		}
	}

	@Override
	public Object extract() {
		try {
			for (int i = 0; i < array.length; i++) {
				QueueList colaLista = (QueueList) array[i];
				if (!colaLista.isEmpty()) {
					return colaLista.extract();
				}
			}
			return null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	public boolean insert(Object object, int prioridad) {
		try {
			if (object != null) {
				QueueList colaLista = (QueueList) array[prioridad];
				colaLista.insert(object);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean isEmpty() {
		try {
			for (Object object : array) {
				QueueList cola = (QueueList) object;
				if (!cola.isEmpty()) {
					return false;
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}

	}

	public void reverse() {
		try {
			QueueList[] array2 = new QueueList[array.length];
			for (int i = 0; i < array.length; i++) {
				array2[array.length - 1 - i] = (QueueList) array[i];
			}
			array = array2;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean search(Object objectBuscar) {
		try {
			for (Object object : array) {
				QueueList cola = (QueueList) object;
				if (cola.search(objectBuscar)) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public int size() {
		return array.length;
	}

	public void sort() {
		reverse();
	}

	public String toString() {
		try {
			if (isEmpty()) {
				return "Cola de prioridad vacía.";
			} else {
				String stringR = "[";
				for (int i = 0; i < array.length; i++) {
					QueueList cola = (QueueList) array[i];
					if (i == array.length - 1) {
						stringR = stringR + cola.toString() + "] ";
					} else {
						stringR = stringR + cola.toString() + ", ";
					}

				}
				return stringR;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}

	}

}
