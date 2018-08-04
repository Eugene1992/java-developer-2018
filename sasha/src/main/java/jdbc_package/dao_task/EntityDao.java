package jdbc_package.dao_task;

import java.util.List;

public interface EntityDao<ID, E> {

    E create(E entity);

    E update(E entity);

    void delete(ID id);

    E get(ID id);

    List<E> getAll();

}
