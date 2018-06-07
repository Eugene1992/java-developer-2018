package lists_pckg;

import java.util.Arrays;

public class MyArrayList<E> extends MyAbstractList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] list;

    public MyArrayList() {
        this.list = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.list = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    public MyArrayList(Object[] objects) {
        list = new Object[objects.length];
        for (int i = 0; i < objects.length; i++) {
            list[i] = (E) objects[i];
        }
        size = objects.length - 1;
    }

    public Object[] extendCapacity() {
        return Arrays.copyOf(list, (list.length - 1) * (3 / 2) + 1);
    }


    public void indexValidation(int index) {
        if (index < 0 || index > size + 1) {
            throw new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }
    }

    public void add(Object element) {
        if (size == (list.length - 1)) {
            list = extendCapacity();
        }
        list[size] = (E) element;
        size++;
    }

    public void add(int index, Object element) {

        indexValidation(index);

        if (index == size) {
            add(element);
        } else if (index == 0) {
            if (size == (list.length - 1)) {
                list = extendCapacity();
            }
            System.arraycopy(list, 0, list, 1, list.length - 1);
            list[0] = (E) element;
            ++size;
        } else {
            if (size == (list.length - 1)) {
                list = extendCapacity();
            }
            System.arraycopy(list, index, list, index + 1, list.length - (index + 1));
            list[index] = (E) element;
            ++size;
        }
    }

    public void set(int index, Object element) {
        indexValidation(index);

        list[index] = (E) element;
    }

    public E get(int index) {
        indexValidation(index);

        return (E) list[index];
    }

    public void remove(int index) {
        indexValidation(index);

        if (index == 0) {
            System.arraycopy(list, 1, list, 0, list.length - 1);
            this.list[size] = null;
        } else if (index == size) {
            list[size] = null;
        } else {
            System.arraycopy(list, index + 1, list, index, list.length - (index + 1));
        }

        --size;

    }


    public boolean isEmpty() {
        boolean flag = true;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != null) {
                flag = false;
            }
        }
        return flag;
    }
//    public boolean isEmpty() {
//        return size == 0;
//    }

    public int indexOf(E element) {
        if (element == null) {
            throw new IllegalArgumentException("You object is null");
        } else {
            for (int i = 0; i < size; i++)
                if (element.equals((E) list[i]))
                    return i;
        }
        return -1;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public int lastIndexOf(E element) {
        if (element == null) {
            throw new IllegalArgumentException("You object is null");
        } else {
            for (int i = size; i >= 0; i--)
                if (element.equals((E) list[i]))
                    return i;
        }
        return -1;
    }


    public MyList subList(int from, int to) {
        indexValidation(from);
        indexValidation(to);
        if (from > to) {
            throw new ArrayIndexOutOfBoundsException("Illegal indexes ");
        }

        int range = to - from;
        Object[] subArray = new Object[range];
        System.arraycopy(list, from, subArray, 0, range);

        MyArrayList subList = new MyArrayList(subArray);
        return subList;
    }


    public void printList() {
        System.out.print(this.getClass().getSimpleName() + ": [ ");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print((E) list[i]);
                continue;
            }
            System.out.print((E) list[i] + ", ");
        }
        System.out.print(" ]");
    }

}
