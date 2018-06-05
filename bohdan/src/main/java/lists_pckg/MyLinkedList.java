package lists_pckg;

import java.util.Arrays;

public class MyLinkedList extends MyAbstractList {

    MyNode[] list;
    transient MyNode first;
    transient MyNode last;
    private String listClass;

    public MyLinkedList() {
        this.list = new MyNode[1];

    }

    public MyNode[] extendCapacity() {
        return Arrays.copyOf(list, list.length + 1);
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

    public void linkLoopValidation(int index) {
        if (list[index].equals(first)) {
            list[index].prev = last;
        }

        if (list[index].equals(last)) {
            list[index].next = first;
        }
    }

    // TODO: 6/4/2018 Check EVERY validation method, recode if needed
    public void linkBorderValidation(int index) {
        if (index == (list.length - 1)) {
            last = list[list.length - 1];
            list = extendCapacity();
        }

        if (index == 0) {
            first = list[index];
        }
    }

    public void linkIndexValidation(int index) {
        if (index > 0) {
            list[index].prev = list[index - 1];
        }
        if (index < list.length - 1) {
            list[index].next = list[index + 1];
        }
    }

    public void add(Object element) {
//        classValidation(element);

        linkBorderValidation(size);

        list[size].item = element;
        linkIndexValidation(size);

        linkLoopValidation(size);

        size++;
    }

    public void add(int index, Object element) {
//        classValidation(element);
        indexValidation(index);
        extendCapacity();

        if (index == size) {
            add(element);
        } else {
            for (int i = size; i >= index; i--) {
                list[i + 1] = list[i];
                linkBorderValidation(i);
                linkIndexValidation(i);
            }
        }

        list[index].item = element;
        linkBorderValidation(index);
        linkIndexValidation(index);

        linkLoopValidation(index);

        size++;
    }

    public void set(int index, Object element) {
//        classValidation(element);
        indexValidation(index);

        int i = 0;
        while (list[i].next != list[index]) {
            i++;
        }
        list[i].next.item = element;
    }

    // TODO: 6/4/2018 Try to solve with recursion???
    public Object get(int index) {
        indexValidation(index);

        int i = 0;
        while (list[i].next != list[index]) {
            i++;
        }

        return list[i].next.item;
    }

    public void remove(int index) {
        indexValidation(index);

        if (index == size) {
            last = null;
        } else {
            for (int i = index + 1; i <= size; i--) {
                list[i - 1] = list[i];
                linkBorderValidation(i);
                linkIndexValidation(i);
            }
        }

        list[size] = null;
        linkBorderValidation(index);
        linkIndexValidation(index);

        linkLoopValidation(index);

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // TODO: 6/4/2018 Recode for MyLinkedList
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

    // TODO: 6/4/2018 Recode for MyLinkedList
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

    // TODO: 6/4/2018 Check LinkedList logic
    public MyList subList(int from, int to) {
        indexValidation(from);
        indexValidation(to);
        if (from > to) {
            throw new ArrayIndexOutOfBoundsException("Illegal indexes ");
        }
        int range = to - from;
        Object[] subArray = new Object[range];
        System.arraycopy(list, from, subArray, 0, range);

        //MyLinkedList subList = new MyLinkedList(subArray);
        //return subList;
        return new MyLinkedList();
    }

    // TODO: 6/4/2018 Recode for MyLinkedList
    public void printList() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.print(" ]");
    }

    public static class MyNode {
        Object item;
        MyNode prev;
        MyNode next;

        MyNode(MyNode prev, Object item, MyNode next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }

        public Object getItem() {
            return item;
        }

        public MyNode getPrev() {
            return prev;
        }

        public MyNode getNext() {
            return next;
        }
    }

}
