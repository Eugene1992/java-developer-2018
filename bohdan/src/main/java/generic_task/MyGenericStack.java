package generic_task;

import java.util.Arrays;

public class MyGenericStack<T> {

    private Object[] list;
    private int size;

    public MyGenericStack() {
        this.list = new Object[10];
    }

    public Object[] extendCapacity() {
        return Arrays.copyOf(list, (list.length - 1) * (3 / 2) + 1);
    }


    public void push(T element) {
        if (size == list.length - 1) {
            this.list = extendCapacity();
        }

        //ArrayIndexOutOfBoundsException: 10
        list[size++] = element;

    }

    public T pop() {

        T element = (T) list[--size];
        list[size] = null;

        return element;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyGenericStack{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
