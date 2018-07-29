package dao;

import java.util.List;

public interface GenericDao<ID, E> {
    E create(E employee);

    E update(E employee);

    void delete(ID id);

    E get(ID id);

    List<E> getAll();
}