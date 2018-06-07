package lists_pckg;

public interface MyList<E> {
    void add(E element);

    void add(int index, E element);

    void set(int index, E element);

    Object get(int index);

    void remove(int index);

    int size();

    boolean isEmpty();

    int indexOf(E element);

    boolean contains(E element);

    int lastIndexOf(E element);

    MyList subList(int from, int to);

    void printList();
}
