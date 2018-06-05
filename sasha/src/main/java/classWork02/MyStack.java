package classWork02;

public class MyStack<E> {

    private Object[] elements;
    private int size;

    MyStack() {
        this.elements = new Object[10];
        this.size = 0;
    }

    public void pop() {
        this.elements[this.size] = null;
        this.size--;
        if (size < 0) throw new ArrayIndexOutOfBoundsException();
    }

    public void push(Object object) {
        this.elements[this.size] = object;
        this.size++;
        if (size > 10) throw new ArrayIndexOutOfBoundsException();
    }

    public int size() {
        return this.size;
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}