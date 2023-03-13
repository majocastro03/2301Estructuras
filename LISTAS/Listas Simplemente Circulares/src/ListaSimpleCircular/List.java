package ListaSimpleCircular;

import java.util.Iterator;

/**
 * @author Lenin Javier Serrano Gil
 * @param <T> generic objects
 */
public interface List<T> {

    public boolean add(T object);

    
    public boolean add(Node node, T object);

    
    public boolean add(Node node, Node next);

    
    public boolean add(T[] objects);

    
    public boolean add(Node node, T[] objects);

    
    public boolean addFirst(T object);

    
    public boolean addFirst(T[] objects);

    
    public boolean addLast(T object);

    
    public boolean addLast(T[] objects);

    
    public boolean clear();

    
    public List clone();

    
    public boolean contains(T object);

    
    public boolean contains(T[] objects);

    
    public Node nodeOf(T object);

    
    public boolean isEmpty();

    
    public T get();

    
    public T get(Node node);

    
    public T getPrevious(Node node);

    
    public T getNext(Node node);

    
    public T getFirst();

    
    public T[] getFirst(int n);

    
    public T getLast();

    
    public T[] getLast(int n);

    
    public T pop();

    
    public boolean remove(T object);

    
    public boolean remove(Node node);

    
    public boolean removeAll(T[] objects);

    
    public boolean retainAll(T[] objects);

    
    public boolean set(Node node, T object);

    
    public int size();

    
    public List subList(Node from, Node to);

    
    public T[] toArray();

    
    public boolean orderBy(char c);

    
    public String toString();

    
    public void print();

    
    public Iterator<Node> iterator();

}
