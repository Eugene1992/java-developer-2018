package classWork02;

public class MyStack<T> {

    private T[] elements;
    private int size;

    MyStack() {
        this.elements = (T[]) new Object[10];
        this.size = 0;
    }

    public T pop() {
        size--;
        if (size < 0) throw new ArrayIndexOutOfBoundsException();
        T cur = elements[size];
        elements[size] = null;
        return cur;
    }

    public void push(T object) {
        elements[size] = object;
        size++;
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