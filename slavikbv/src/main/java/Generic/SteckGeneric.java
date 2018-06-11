package Generic;

import java.util.Arrays;

public class SteckGeneric<T> {
    private Object[] list;
    private int size;

    public SteckGeneric() {
        this.list = new Object[10];
        this.size = 0;
    }


    public void push(T element) {

        if (size == list.length) {
            list = Arrays.copyOf(list, list.length * 3 / 2 + 1);
        }
        size++;
        list[size - 1] = element;

    }

    public T pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Empty steck");
        }
        T element = (T) list[size - 1];
        list = Arrays.copyOf(list, size - 1);
        size = size - 1;
        return element;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }

    public Object[] getList() {
        return list;
    }

    public void setList(Object[] list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
