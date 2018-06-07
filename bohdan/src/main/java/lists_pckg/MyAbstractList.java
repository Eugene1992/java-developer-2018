package lists_pckg;

public abstract class MyAbstractList<E> implements MyList<E> {

    protected int size;

    public int size() {
        return size;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

}
