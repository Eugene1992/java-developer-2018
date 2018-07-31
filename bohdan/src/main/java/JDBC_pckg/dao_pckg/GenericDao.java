package JDBC_pckg.dao_pckg;

import JDBC_pckg.AbstractEntity;

import java.util.List;

public interface GenericDao<ID, E extends AbstractEntity> {

    E create(E employee);

    E update(E employee);

    boolean delete(ID id);

    E get(ID id);

    List<E> getAll();

    void close();
}