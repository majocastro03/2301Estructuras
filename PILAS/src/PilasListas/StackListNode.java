package PilasListas;

public class StackListNode<T> {

    T object;
    StackListNode<T> next;
    Object data;

    public StackListNode(){
        this.object = null;
        this.next = null;
        this.data = null;
    }

    public StackListNode(T object){
        this.object = object;
        this.next = null;
        this.data = null;
    }

    public T getObject() {
        return object;
    }

    public StackListNode<T> getNext() {
        return next;
    }

    public void setNext(StackListNode<T> next) {
        this.next = next;
    }

    public void push(Object o) {
    }

    public Object getData() {
        return data;
    }

    public void setData(T object) {
        this.data = data;
    }

}
