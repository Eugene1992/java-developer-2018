package ArrayListImpl;

import java.util.Arrays;

public class ArrayL {
    int capacity;
    String type;
    Object[] list;

    /* конструктор без параметров */
    public ArrayL() {
        this.list = new Object[10];
        this.capacity = 10;
    }

    /* конструктор с параметром */
    public ArrayL(int initCapacity) {
        this.list = new Object[initCapacity];
        this.capacity = initCapacity;
    }

    /* метод add */
    public void add(Object element) {
        if (list[capacity - 1] != null) {
            list = Arrays.copyOf(list, (capacity * 3 / 2 + 1));
            capacity = (capacity * 3 / 2 + 1);
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = element;
                break;
            }
        }
    }

    /* вывод на экран */
    public void arrayListOut() {
        System.out.print("[ ");
        for (int i = 0; i < this.list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("]");
    }

    /* метод remove */
    public void remove(int ind) {
        if (ind >= capacity) System.out.println("error");
        for (int i = ind; i < capacity - 1; i++) {
            list[i] = list[i + 1];
        }
        list = Arrays.copyOf(list, capacity - 1);
        capacity = capacity - 1;
    }

    /* метод isEmpty*/
    public boolean isEmpty() {
        int num = 0;
        for (int i = 0; i < capacity; i++) {
            if (list[i] != null) {
                num = num + 1;
            }
        }
        if (num == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* метод size*/
    public int size() {
        return capacity;
    }

    /* метод contains*/
    public boolean contains(Object element) {
        int num = 0;
        for (int i = 0; i < capacity; i++) {
            if (list[i] == element) {
                num = num + 1;
            }
        }
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* метод subList*/
    public Object[] subList(int fromincl, int toexcl) {
        Object[] l = new Object[toexcl - fromincl];

        for (int i = 0; i <= toexcl - fromincl; i++) {
            l[i] = list[fromincl + i];
        }
        return l;
    }
}



