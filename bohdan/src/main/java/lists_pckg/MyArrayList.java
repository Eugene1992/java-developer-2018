package lists_pckg;

import java.util.Arrays;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    Object[] list;
    private int size;
    private String listClass;

    public MyArrayList() {
        this.list = new Object[10];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.list = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

//    public MyArrayList(Object[] objects){}

    public void add(Object element) {
        if (this.list[0] != null) {
            if (this.listClass != element.getClass().toString()) {
                throw new IllegalArgumentException("Illegal element type: " + element.getClass() + ", needed " + listClass);
            }
        }

        if (size == (list.length - 1)) {
            list = Arrays.copyOf(list, (list.length - 1) * (3 / 2) + 1);
        }
        list[++size] = element;
    }

    public void add(int index, Object element) {
        if (this.list[0] != null) {
            if (this.listClass != element.getClass().toString()) {
                throw new IllegalArgumentException("Illegal element type: " + element.getClass() + ", needed " + listClass);
            }
        }
        if (index < 0 || index > size + 1) {
            throw new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }

        if (index == size) {
            if (size == (list.length - 1)) {
                list = Arrays.copyOf(list, (list.length - 1) * (3 / 2) + 1);
            }
            list[++size] = element;
        } else if (index == 0) {
            if (size == (list.length - 1)) {
                list = Arrays.copyOf(list, (list.length - 1) * (3 / 2) + 1);
            }
            System.arraycopy(list, 0, list, 1, list.length - 1);
            list[0] = element;
            ++size;
        } else {
            if (size == (list.length - 1)) {
                list = Arrays.copyOf(list, (list.length - 1) * (3 / 2) + 1);
            }
            System.arraycopy(list, index, list, index + 1, list.length - 1);
            list[index] = element;
            ++size;
        }
    }

    public void set(int index, Object element) {
        if (this.list[0] != null) {
            if (this.listClass != element.getClass().toString()) {
                throw new IllegalArgumentException("Illegal element type: " + element.getClass() + ", needed " + listClass);
            }
        }
        if (index < 0 || index > size + 1) {
            throw new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }

        list[index] = element;
    }

    public Object get(int index) {
        if (index < 0 || index > size + 1) {
            throw new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }

        return list[index];
    }

    public void remove(int index) {
        if (index < 0 || index > size + 1) {
            throw new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }

        if (index == 0) {
            this.list[0] = null;
            System.arraycopy(list, 1, list, 0, list.length - 1);
        } else if (index == size) {
            list[size] = null;
        } else {
            System.arraycopy(list, index + 1, list, index, list.length - (index + 1));
        }

        --size;

    }

    void printList() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.print(" ]");
    }

}
