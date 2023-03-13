package ListaSimpleCircular;

/**
 * @author Lenin Javier Serrano Gil
 * @param <T> generic objects
 */
public interface Node<T> {

    
    public boolean setObject(T object);

    public T getObject();

    public boolean isEquals(T object);

    public String toString();

}