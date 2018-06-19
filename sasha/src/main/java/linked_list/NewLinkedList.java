package linked_list;

import array_list.NewList;
import iterator_comporator.MyIterator;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * https://habr.com/post/127864/
 */

public class NewLinkedList<E> implements NewList<E> {

    private int size;
    private MyNode<E> firstElement;
    private MyNode<E> lastElement;


    NewLinkedList() {
        this.size = 0;
        this.firstElement = null;
        this.lastElement = null;
    }

    @Override
    public void add(E object) {
        MyNode<E> prevLastElement = lastElement;
        MyNode<E> newNode = new MyNode<>(prevLastElement, object, null);
        lastElement = newNode;
        if (prevLastElement == null) {
            firstElement = newNode;
        } else {
            prevLastElement.nextElement = newNode;
        }
        size++;
    }

    @Override
    public void add(E object, int position) {
        if (position == size) {
            add(object);
        } else if (position == 0) {
            MyNode<E> nextElement = firstElement.nextElement;
            MyNode<E> newNode = new MyNode<>(null, object, firstElement);
            nextElement.prevElement = firstElement;
            firstElement = newNode;
            size++;
        } else if (position > 0 && position < size) {
            MyNode<E> nextElement = node(position);
            MyNode<E> prevElement = nextElement.prevElement;
            MyNode<E> newNode = new MyNode<>(prevElement, object, nextElement);
            nextElement.prevElement = newNode;
            prevElement.nextElement = newNode;
            size++;
        } else throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int position) {
        return node(position).element;
    }

    @Override
    public void set(E object, int position) {
        node(position).element = object;
    }

    @Override
    public void remove(int position) {
        if (position == size) {
            MyNode<E> newLastElement = lastElement.prevElement;
            newLastElement.nextElement = null;
            lastElement = newLastElement;
            size--;
        } else if (position == 0) {
            MyNode<E> newFirstElement = firstElement.nextElement;
            newFirstElement.prevElement = null;
            firstElement = newFirstElement;
            size--;
        } else if (position > 0 && position < size) {
            MyNode<E> prevElement = node(position - 1);
            MyNode<E> nextElement = node(position + 1);
            prevElement.nextElement = nextElement;
            nextElement.prevElement = prevElement;
            size--;
        } else throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public boolean contains(Object object) {
        int k = 0;
        boolean f = false;
        while (k < size) {
            if (object.equals(node(k).element)) {
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
    public int indexOf(Object object) {
        int k = 0;
        int position = 0;
        if (contains(object)) {
            while (k < size) {
                if (object.equals(node(k).element)) {
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

    public NewLinkedList subList(int from, int to) {
        return null;
    }

    @Override
    public int lastIndexOf(Object object, int fromPosition) {
        int k = fromPosition;
        int position = -1;

        while (k > 0) {
            if (object.equals(node(k).element)) {
                position = k;
                k = 0;
            }
            k--;
        }
        return position;
    }

    @Override
    public MyIterator iterator() {
        return new MyItr();
    }

    private static class MyNode<E> {
        E element;
        MyNode<E> nextElement;
        MyNode<E> prevElement;

        MyNode(MyNode<E> prevElement, E element, MyNode<E> nextElement) {
            this.element = element;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }
    }

    private MyNode<E> node(int position) {
        if (position >= size || position < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (position < (size >> 1)) {
            MyNode<E> element = firstElement;
            for (int i = 0; i < position; i++) {
                element = element.nextElement;
            }
            return element;
        } else {
            MyNode<E> element = lastElement;
            for (int i = size - 1; i > position; i--) {
                element = element.prevElement;
            }
            return element;
        }
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
            if (i >= NewLinkedList.this.size) throw new ConcurrentModificationException();
            cursor++;
            return (E) NewLinkedList.this.node(i);
        }

        @Override
        public void remove() {
            if (lastElement < 0) {
                throw new IllegalStateException();
            }

            NewLinkedList.this.remove(lastElement);
            cursor = lastElement;
            lastElement = -1;
        }
    }
}
