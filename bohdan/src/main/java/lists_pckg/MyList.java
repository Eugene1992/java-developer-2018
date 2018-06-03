package lists_pckg;

public interface MyList {
    void add(Object element);

    void add(int index, Object element);

    void set(int index, Object element);

    Object get(int index);

    void remove(int index);

    int size();

    boolean isEmpty();

    int indexOf(Object o);

    boolean contains(Object o);

    int lastIndexOf(Object o);

    MyList subList(int from, int to);

    void printList();
}
