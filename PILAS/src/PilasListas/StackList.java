package PilasListas;

import java.util.Arrays;
import ListaSimple.*;
public class StackList<T> implements StackInterface<T> {

    StackListNode top;
    int size;
    LinkedList<Object> linkedList;
    public StackList() {
        top = null;
        size = 0;
    }

    public void clear(){
      if(isEmpty()) return;
       try {
           top = null;
           size = 0;
           return;
       }catch (Exception e){
           e.printStackTrace();
       }
       return;
       }

    @Override
    public boolean isEmpty() {
       return size == 0;
    }

    @Override
    public T peek() {
        if(isEmpty()) return null;
        try{

        return (T) top;

        } catch (Exception e) {
        e.printStackTrace();
    }
        return null;
    }

    @Override
    public T pop() {
        if(isEmpty()) return null;
        try{

           T dato = (T) top.getObject();
           this.top = top.getNext();
           size--;
           return dato;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean push(Object object) {
        try {
            StackListNode ingresar = new StackListNode<T>();
            if (isEmpty()) {
                top = ingresar;
                return true;
            }

            ingresar.setNext(top);
            top = ingresar;
            size++;
            return false;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(T object) {
        if(isEmpty()) return false;
        try {
            StackListNode pila = top;
            while(pila!= null){
                pila = pila.getNext();
                if(top == object);
                return true;
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public void sort() {
        StackList pila = new StackList();
        StackList pila2 = new StackList();
        String nombrePrimero = peek().getClass().getName();
        while(linkedList.size() != 0){
            Object object = pop();
            String clase = object.getClass().getName();
            if(nombrePrimero==clase){
                pila.push(object);
            }else{
                pila2.push(object);
            }
        }
        while(pila2.linkedList.size()!=0){
            push(pila2.pop());
        }
        while(pila.linkedList.size()!=0){
            push(pila.pop());
        }
    }

    private Object[] toArray() {

        Object[] array = new Object[size];

        StackListNode nodo = top;
        int i = 0;
        while(nodo != null){
            array[i] = nodo.data;
            nodo = nodo.next;
            i++;
        }
        return array;
    }
    @Override
    public boolean reverse() {
        if (isEmpty()) return false;
        try {
            StackListNode pila = new StackListNode();

            Object[] array = toArray();
            Arrays.sort(array);
            clear();

            for (int i = 0; i < array.length; i++) {
                push(array[i]);
            }

            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String toString(){
        return "pila{ " +
                ", top = " + top +
                ", size = " + size +
                '}';
    }

}

