package array_list;


import iterator_comporator.MyIterator;

public interface NewList<E> {

    void add(E object);

    void add(E object, int position);

    int size();

    Object get(int position);

    void set(E object, int position);

    void remove(int position);

    boolean contains(E object);

    int indexOf(E object);

    boolean isEmpty();

    int lastIndexOf(E object, int fromPosition);

    MyIterator<E> iterator();
}
