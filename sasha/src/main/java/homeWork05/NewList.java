package homeWork05;

public interface NewList {

    void add(Object object);

    void add(Object object, int position);

    int size();

    Object get(int position);

    void set(Object object, int position);

    void remove(int position);

    boolean contains(Object object);

    int indexOf(Object object);

    boolean isEmpty();

    NewArrayList subList(int from, int to);

    int lastIndexOf(Object object, int fromPosition);
}
