package array_list;

import iterator_comporator.MyIterator;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class NewArrayList<E> implements NewList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] newList;
    private int size;
    private int capacity;

    public NewArrayList() {
        this.newList = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
    }

    public NewArrayList(int capacity) {
        if (capacity > 0) {
            this.newList = (E[]) new Object[capacity];
            this.capacity = capacity;
            this.size = 0;
        } else if (capacity == 0) {
            this.newList = (E[]) new Object[DEFAULT_CAPACITY];
            this.size = 0;
            this.capacity = DEFAULT_CAPACITY;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    capacity);
        }
    }

    private void increaseCapacity(int newCapacity) {
        if (newCapacity >= capacity) {
            capacity = capacity * 3 / 2 + 1;
            newList = Arrays.copyOf(newList, capacity);
        }
    }

    @Override
    public void add(E object) {
        increaseCapacity(size + 1);
        newList[size] = object;
        size++;
    }

    @Override
    public void add(E object, int position) {
        increaseCapacity(size + 1);
        if (position == 0) {
            System.arraycopy(newList, 0, newList, 1, size);
            newList[0] = object;
            size++;
        } else if (position > size || position < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(newList, position, newList, position + 1, size - position + 1);
            newList[position] = object;
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int position) {
        if (position >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            return newList[position];
        }
    }

    @Override
    public void set(E object, int position) {
        if (position >= size || position < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            newList[position] = object;
        }
    }

    @Override
    public void remove(int position) {
        if (position == 0) {
            System.arraycopy(newList, 1, newList, 0, size);
            size--;
        } else if (position >= size || position < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(newList, position + 1, newList, position, size - position + 1);
            size--;
        }
    }

    @Override
    public boolean contains(E object) {
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

    @Override
    public int indexOf(E object) {
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

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }

    @Override
    public NewArrayList subList(int from, int to) {
        NewArrayList sublist = new NewArrayList();

        if (from > to) {
            throw new IndexOutOfBoundsException();
        } else if (from < 0 || to > size) {
            throw new IndexOutOfBoundsException();
        } else if (from == to) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = from; i < to; i++) {
                sublist.add(this.newList[i]);
            }
        }
        return sublist;
    }

    @Override
    public int lastIndexOf(E object, int fromPosition) {
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

    public MyIterator<E> iterator() {
        return new MyItr();
    }

    private class MyItr implements MyIterator<E> {
        int cursor = 0;
        int lastElement = -1;

        @Override
        public boolean hasNext() {
            if (cursor < size) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public E next() {
            int i = cursor;
            lastElement = cursor;
            if (i >= size) throw new NoSuchElementException();
            if (i >= NewArrayList.this.newList.length) throw new ConcurrentModificationException();
            cursor++;
            return NewArrayList.this.newList[i];
        }

        @Override
        public void remove() {
            if (lastElement < 0) {
                throw new IllegalStateException();
            }

            NewArrayList.this.remove(lastElement);
            cursor = lastElement;
            lastElement = -1;
        }
    }
}
