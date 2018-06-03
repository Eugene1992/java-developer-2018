package lists_pckg;

public abstract class MyAbstractList implements MyList {
    protected int size;

    public int size() {
        return size;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

}
