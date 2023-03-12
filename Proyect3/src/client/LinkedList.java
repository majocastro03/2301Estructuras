package client;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(User user) {
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

