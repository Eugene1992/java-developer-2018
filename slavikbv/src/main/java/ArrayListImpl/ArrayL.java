package ArrayListImpl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayL implements Iterable {
    // String type;
    Object[] list;
    private int size;


    /* конструктор без параметров */
    public ArrayL() {
        this.list = new Object[10];
        this.size = 10;
    }

    /* конструктор с параметром */
    public ArrayL(int initCapacity) {
        if (initCapacity <= 0) {
            throw new ArrayIndexOutOfBoundsException("Initial Capacity should be positive");
        }
        this.list = new Object[initCapacity];
        this.size = initCapacity;
    }

    public Object[] getList() {
        return list;
    }

    public void setList(Object[] list) {
        this.list = list;
    }

    /* метод add */
    public void add(Object element) {
        if (list[size - 1] != null) {
            list = Arrays.copyOf(list, (size * 3 / 2 + 1));
            size = (size * 3 / 2 + 1);
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
        if (ind >= size) System.out.println("error");
        for (int i = ind; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list = Arrays.copyOf(list, size - 1);
        size = size - 1;
    }

    /* метод isEmpty*/
    public boolean isEmpty() {
        int num = 0;
        for (int i = 0; i < size; i++) {
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
        return size;
    }

    /* метод contains*/
    public boolean contains(Object element) {
        int num = 0;
        for (int i = 0; i < size; i++) {
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
    public ArrayL subList(int fromincl, int toexcl) {
        ArrayL listnew = new ArrayL(toexcl - fromincl);

        for (int i = 0; i <= toexcl - fromincl; i++) {
            listnew.add(list[fromincl + i]);
        }
        return listnew;
    }

    /* метод IndexOf*/
    public int indexOf(Object element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (list[i] == element) index = i;
            break;
        }
        return index;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {
        private int coursor = 0;

        @Override
        public boolean hasNext() {
            return coursor != size;

        }


        @Override
        public Object next() {
            if (coursor >= size) {
                throw new NoSuchElementException();
            }
            coursor = coursor + 1;
            return list[coursor - 1];
        }
    }
}




