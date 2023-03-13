package Queues;

import List.LinkedList;
import List.LinkedListNode;

public class QueueList implements InterfaceQueue {

	private LinkedList<Object> lista;
	private int size;

	public QueueList() {
		this.lista = new LinkedList<>();
		this.size = lista.size();
	}

	public QueueList(Object object) {
		this.lista = new LinkedList<>(object);
		this.size = lista.size();
	}

	public void clear() {
		lista.clear();
	}

	public Object extract() {
		try {
			LinkedListNode<Object> pop = lista.head;
			if (lista.head != null) {
				LinkedListNode<Object> siguiente = lista.head.next;
				lista.head = siguiente;
				size--;

			} else {
				lista.head = null;
			}
			return (Object) pop.getObject();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public boolean insert(Object object) {
		try {
			boolean o = lista.add(object);
			size++;
			return o;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isEmpty() {
		return lista.isEmpty();
	}

	public void reverse() {
		try {
			QueueList cola2 = new QueueList();
			int tam = size;
			for (int i = 0; i < tam; i++) {
				cola2.lista.addFirst(extract());
			}
			this.size = cola2.size;
			this.lista = cola2.lista;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public boolean search(Object object) {
		boolean res = false;
		try {
			QueueList cola2 = new QueueList();
			int tam = lista.size();
			for (int i = 0; i < tam; i++) {
				Object o = extract();
				if (o == object) {
					cola2.insert(o);
					res = true;
				} else {
					cola2.insert(o);
				}
			}
			this.size = cola2.size;
			this.lista = cola2.lista;
			return res;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return res;
		}

	}

	public int size() {
		return lista.size();
	}

	public void sort() {
		try {
			QueueList cola1 = new QueueList();
			QueueList cola2 = new QueueList();
			int tam = lista.size();
			for (int i = 0; i < tam; i++) {
				Object objt = extract();
				if (objt != null) {
					if (objt instanceof String) {
						cola1.insert(objt);
					} else {
						cola2.lista.addFirst(objt);
					}
				}
			}
			for (int i = 0; i < tam; i++) {
				if (cola1.size != 0) {
					insert(cola1.extract());
				} else {
					insert(cola2.extract());
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String toString() {
		return lista.toString();

	}

}
