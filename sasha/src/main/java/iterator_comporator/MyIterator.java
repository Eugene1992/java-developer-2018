package iterator_comporator;

import java.util.function.Consumer;

public interface MyIterator<E> {
    boolean hasNext();

    E next();

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

    default void forEachRemaining(Consumer<? super E> action) {

    }
}
