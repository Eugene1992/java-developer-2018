package oop_lists;

public class IArrayList extends IAbstractList implements IList {
    @Override
    public boolean add(Object elem) {
        return false;
    }

    @Override
    public void remove(int index) {
        super.remove(index);
    }
}
