package PilasArray;


public class StackArray {
    int tope;
    int top=-1;
    Object [] array_elementos;
    public StackArray(int nmr) {
        this.array_elementos = new Object[nmr];
        tope=nmr;
    }
    
    public Object peek(){
        return array_elementos[top];
    }
    public Object pop(){
        Object o = array_elementos[top];
        array_elementos[top]=null;
        top--;
        return  o;   
    }
    public boolean push(Object object){
        if(object!=null){
        	array_elementos[top+1]=object;
            top++;
            return true;
        }else{
            return false;
        }
    }
    public boolean search(Object object){
        boolean ack = false;
        StackArray pila = new StackArray(tope);
        while(top != -1){
            Object o = pop();
            if(o==object){
                ack = true;
            }
            pila.push(o);
        }
        while(pila.top != -1){
            push(pila.pop());
        }
        return ack;
    }
    
    public void sort(){
    	try {
			Object[] object = new Object[array_elementos.length];
			for (int ii = 0; ii < size(); ii++) {
				object[ii] = array_elementos[ii];
			}
			int n = object.length;
			for (int ii = 0; ii < n-1; ii++) {
				for (int jj = 0; jj < n-1; jj++) {
					if (((Comparable<Object>) object[jj]).compareTo(object[jj+1]) > 0) {
						Object temporal = object[jj];
						object[jj] = object[jj+1];
						object[jj+1] = temporal;
					}
				}
			}
			array_elementos = object;
		} catch (Exception e) {
			e.getStackTrace();
		}

    }
    public void reverse(){
        StackArray pila = new StackArray(tope);
        while(pila.top!=-1){
            pila.push(pop());
        }
        array_elementos = pila.array_elementos;
    }
    
    public int size(){
        return top+1;
    }
    
    @Override
    public String toString(){
        String string = new String();
        for (int i = 0; i < array_elementos.length; i++) {
            Object object = array_elementos[i];
            string += object.toString()+",";
        }
        return string;
    }

}
