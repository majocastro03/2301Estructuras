package PilasArray;


public interface StackInterface<T> {

    /***
     * 1. Elimina todos los elementos de la lista.
     * @return boolean true
     */
    public void clear();

    /***
     * 2. Retorna verdadero si no contiene elementos.
     * @return boolean true
     */
    public boolean isEmpty();

    /***
     * 3.Retorna el último objeto.
     * @return Object objeto
     */
    public Object peek();

    /***
     * 4. Elimina el objeto en la lista
     * @return true
     */
    public Object pop();

    /***
     * 5. Agrega un objeto al final de la lista.
     * @param object objeto
     * @return boolean true
     */
    public boolean push(Object object);

    /***
     * 6. Retorna el número de nodos de esta lista.
     * @return int amount
     */
    public int size();

    /***
     * 7.  buscar un elemento en la pila
     *  * @param T objeto
     * @return boolean true
     */
    public boolean search(T object);

    /***
     * 8.ordenar los elementos en la pila de forma ascendente.
     *  * @param T objeto
     * @return boolean true
     */
    public boolean sort();

    /***
     * 8. invertir la pila
     *  * @param T objeto
     * @return boolean true
     */
    public void reverse();

    public String toString();
}
