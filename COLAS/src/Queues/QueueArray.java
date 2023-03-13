package Queues;

public class QueueArray implements InterfaceQueue {

    Object[] array;
    int size;

    public QueueArray(int size) {
        array = new Object[(size > 0) ? size : 1];
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public Object extract() {
        try {
            Object res = array[0];
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    array[i - 1] = array[i];
                    array[i] = null;

                } else {
                    array[i] = array[i + 1];
                }

            }
            size--;
            return res;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean insert(Object object) {
        try {
            if (size == array.length) {
                System.out.println("Cola llena.");
                return false;
            }
            if (array[size] == null) {
                array[size] = object;
                size++;
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size != 0) {
            return false;
        } else {
            return true;
        }
    }

    public void reverse() {
        try {
            QueueArray cola2 = new QueueArray(size);
            for (int i = 0; i < size; i++) {
                cola2.insert(array[i]);
            }

            for (int i = size; i >= 0; i--) {
                array[i] = cola2.extract();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean search(Object object) {
        try {
        	QueueArray cola2 = new QueueArray(size);
            for (int i = 0; i < size; i++) {
                if (array[i] == object) {
                    return true;
                } else {
                    cola2.insert(array[i]);
                }
            }
            return false;

        } catch (Exception e) {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void sort() {
        try {
        	QueueArray cola1 = new QueueArray(size);
        	QueueArray cola2 = new QueueArray(size);

            int tam = size;

            for (int i = 0; i < tam + 1; i++) {
                Object objt = extract();
                if (objt != null) {
                    if (objt instanceof String) {
                        cola1.insert(objt);
                    } else {
                        cola2.insert(objt);
                    }
                }
            }
            for (int i = 0; i < tam + 1; i++) {
                if (cola1.size == 0) {
                    array[i] = cola2.extract();
                } else {
                    array[i] = cola1.extract();
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public String toString() {
        try {
            String stringR = "[";
            if (isEmpty()) {
                return "Cola vacía";
            } else {
                for (int i = 0; i < array.length; i++) {
                    if (i == array.length - 1) {
                        stringR = stringR + array[i] + "] ";
                    } else {
                        stringR = stringR + array[i] + ", ";
                    }

                }
                return stringR;
            }
        } catch (Exception e) {
            return "";
        }

    }

}

