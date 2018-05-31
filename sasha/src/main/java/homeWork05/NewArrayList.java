package homeWork05;

import java.util.Arrays;

public class NewArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] newList;
    private int size;
    private int capacity;

    public NewArrayList() {
        this.newList = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
    }

    public NewArrayList(int capacity) {
        if (capacity > 0) {
            this.newList = new Object[capacity];
            this.capacity = capacity;
            this.size = 0;
        } else if (capacity == 0) {
            this.newList = new Object[DEFAULT_CAPACITY];
            this.size = 0;
            this.capacity = DEFAULT_CAPACITY;
        } else {
            System.out.println("You want to create list with invalid capacity!!!");
        }
    }

    private void increaseCapacity(int newCapacity) {
        if (newCapacity >= capacity) {
            capacity = capacity * 3 / 2 + 1;
            newList = Arrays.copyOf(newList, capacity);
        }
    }

    public void add(Object object) {
        increaseCapacity(size + 1);
        newList[size] = object;
        size++;
    }

    public void add(Object object, int position) {
        increaseCapacity(size + 1);
        if (position == 0) {
            System.arraycopy(newList, 0, newList, 1, size);
            newList[0] = object;
            size++;
        } else if (position > size || position < 0) {
            System.out.println("ArrayList don't have holes!!!");
        } else {
            System.arraycopy(newList, position, newList, position + 1, size - position + 1);
            newList[position] = object;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public Object get(int position) {
        if (position >= size) {
            System.out.println("Elements with this index not exist");
            return null;
        } else {
            return newList[position];
        }
    }

    public void set(Object object, int position) {
        if (position >= size || position < 0) {
            System.out.println("Index to set element is out of array");
        } else {
            newList[position] = object;
        }
    }

    public void remove(int position) {
        if (position == 0) {
            System.arraycopy(newList, 1, newList, 0, size);
            size--;
        } else if (position >= size || position < 0) {
            System.out.println("ArrayList don't have holes!!!");
        } else {
            System.arraycopy(newList, position + 1, newList, position, size - position + 1);
            size--;
        }
    }

    public boolean contains(Object object) {
        int k = 0;
        boolean f = false;
        while (k < size) {
            if (object.equals(newList[k])) {
                f = true;
                k = size;
            } else {
                f = false;
            }
            k++;
        }
        return f;
    }

    public int indexOf(Object object) {
        int k = 0;
        int position = 0;
        if (contains(object)) {
            while (k < size) {
                if (object.equals(newList[k])) {
                    position = k;
                    k = size;
                }
                k++;
            }
            return position;
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }

    public NewArrayList subList(int from, int to) {
        NewArrayList sublist = new NewArrayList();

        if (from > to) {
            System.out.println("Position from which you want copy must be less than position to you want copy!!!");
        } else if (from < 0 || to > size) {
            System.out.println("You entered incorrect from and to positions");
        } else if (from == to) {
            System.out.println("You entered equal from and to positions");
        } else {
            System.arraycopy(newList, from, sublist, 0, to - from);
            return sublist;
        }
        return sublist;
    }

    public int lastIndexOf(Object object, int fromPosition) {
        int k = fromPosition;
        int position = -1;

        while (k > 0) {
            if (object.equals(newList[k])) {
                position = k;
                k = 0;
            }
            k--;
        }
        return position;

    }
}
