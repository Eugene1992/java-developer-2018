package lists_pckg;

import java.util.Arrays;

public class MyArrayList extends MyAbstractList {

    private static final int DEFAULT_CAPACITY = 10;
    Object[] list;
    private String listClass;

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
            list[i] = objects[i];
        }
        size = objects.length - 1;
    }

    public Object[] extendCapacity() {
        return Arrays.copyOf(list, (list.length - 1) * (3 / 2) + 1);
    }

    public void classValidation(Object element) {
        if (this.list[0] != null) {
            if (this.listClass != element.getClass().toString()) {
                throw new IllegalArgumentException("Illegal element type: " + element.getClass() + ", needed " + listClass);
            }
        }
    }

    public void indexValidation(int index) {
        if (index < 0 || index > size + 1) {
            throw new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }
    }

    public void add(Object element) {
//        classValidation(element);

        if (size == (list.length - 1)) {
            list = extendCapacity();
        }
        list[size] = element;
        size++;
    }

    public void add(int index, Object element) {
//        classValidation(element);

        if (index < 0 || index > size + 1) {
            throw new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }

        if (index == size) {
            if (size == (list.length - 1)) {
                list = extendCapacity();
            }
            list[++size] = element;
        } else if (index == 0) {
            if (size == (list.length - 1)) {
                list = extendCapacity();
            }
            System.arraycopy(list, 0, list, 1, list.length - 1);
            list[0] = element;
            ++size;
        } else {
            if (size == (list.length - 1)) {
                list = extendCapacity();
            }
            System.arraycopy(list, index, list, index + 1, list.length - (index + 1));
            list[index] = element;
            ++size;
        }
    }

    public void set(int index, Object element) {
//        classValidation(element);
        indexValidation(index);

        list[index] = element;
    }

    public Object get(int index) {
        indexValidation(index);

        return list[index];
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

    public int indexOf(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("You object is null");
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(list[i]))
                    return i;
        }
        return -1;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int lastIndexOf(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("You object is null");
        } else {
            for (int i = size; i >= 0; i--)
                if (o.equals(list[i]))
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
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.print(" ]");
    }

}
