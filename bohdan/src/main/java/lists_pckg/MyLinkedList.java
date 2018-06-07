package lists_pckg;


public class MyLinkedList<E> extends MyAbstractList<E> {

    transient MyNode first;
    transient MyNode last;

    public MyLinkedList() {

    }

    /*
    public MyLinkedList(Object[] objects) {
        list = new Object[objects.length];
        for (int i = 0; i < objects.length; i++) {
            list[i] = objects[i];
        }
        size = objects.length - 1;
    }
    */


    public void indexValidation(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }
    }


    public MyNode<E> getNodeByIndex(int index) {
        indexValidation(index);

        MyNode<E> link = first;
        if (index == 0) {
            return link;
        }
        for (int i = 1; i < index; i++) {
            link = link.next;
        }
        return link;
    }

    public void add(E element) {
        if (first == null) {
            first = last = new MyNode<E>(last, element, first);
            first.prev = last;
        } else {
            last = new MyNode<E>(getNodeByIndex(size), element, first);
            getNodeByIndex(size).next = last;
            first.prev = last;
        }

        size++;
    }

    public void add(int index, E element) {
        indexValidation(index);

        if (index == size) {
            add(element);
        } else if (index == 0) {
            first = new MyNode<E>(last, element, first);
            first.next.prev = first;
        } else {
            getNodeByIndex(index - 1).next = new MyNode<E>(getNodeByIndex(index - 1), element, getNodeByIndex(index));
            getNodeByIndex(index + 1).prev = getNodeByIndex(index);
        }

        size++;
    }

    public void set(int index, E element) {
        indexValidation(index);

        getNodeByIndex(index).item = element;
    }

    public E get(int index) {
        indexValidation(index);

        return (E) getNodeByIndex(index).getItem();
    }

    public void remove(int index) {
        indexValidation(index);

        if (index == size) {
            last = last.prev;
            last.next = first;
        } else if (index == 0) {
            first = first.next;
            first.prev = last;
        } else {
            getNodeByIndex(index - 1).next = getNodeByIndex(index + 1);
            getNodeByIndex(index).prev = getNodeByIndex(index - 1);
        }

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public int indexOf(E element) {
        if (element == null) {
            throw new IllegalArgumentException("You object is null");
        } else {
            for (int i = 0; i < size; i++) {
                if (getNodeByIndex(i).item.equals(element))
                    return i;
            }
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
                if (getNodeByIndex(i).item.equals(element))
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

        MyLinkedList<E> subList = new MyLinkedList<>();
        subList.first = getNodeByIndex(from);

        int range = to - from;


        return subList;
    }

    public void printList() {
        System.out.print("[ ");
        for (int i = 0; i <= size; i++) {
            if (i == size) {
                System.out.print(getNodeByIndex(i));
                continue;
            }
            System.out.print(getNodeByIndex(i) + ", ");
        }
        System.out.println(" ]");
    }

    public static class MyNode<E> implements Cloneable {
        E item;
        MyNode prev;
        MyNode next;


        MyNode(MyNode prev, E item, MyNode next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }


        public E getItem() {
            return item;
        }

        public MyNode getPrev() {
            return prev;
        }

        public MyNode getNext() {
            return next;
        }

        @Override
        public String toString() {
            return item + "";
        }
    }

}
