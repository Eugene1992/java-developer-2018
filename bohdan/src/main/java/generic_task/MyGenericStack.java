package generic_task;

import java.util.Arrays;

public class MyGenericStack<T> {

    Object[] list = new Object[10];
    private int size;

    public void push(T element) {
        list[size] = element;
        size++;

        if (size >= list.length) {
            list = Arrays.copyOf(list, (list.length - 1) * (3 / 2) + 1);
        }
    }

    public T pop() {
        size--;
        T element = (T) list[size];
        list[size] = null;

        return element;
    }

    public int size() {
        return size;
    }

}
