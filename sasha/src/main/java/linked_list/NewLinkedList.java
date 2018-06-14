package linked_list;

import homeWork05.NewList;
import iterator_comporator.MyIterator;

/**
 *
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
        } else {
            MyNode<E> prevFirstElement = firstElement;
            MyNode<E> newNode = new MyNode<>(prevFirstElement, object, null);
            lastElement = newNode;
            if (prevFirstElement == null) {
                firstElement = newNode;
            } else {
                prevFirstElement.nextElement = newNode;
            }
            size++;
        }

    }

    @Override
    public int size() {
        return size;
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

    @Override
    public E get(int position) {
        return node(position).element;
    }

    @Override
    public void set(Object object, int position) {

    }

    @Override
    public void remove(int position) {

    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public NewLinkedList subList(int from, int to) {
        return null;
    }

    @Override
    public int lastIndexOf(Object object, int fromPosition) {
        return 0;
    }

    @Override
    public MyIterator iterator() {
        return null;
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
}
