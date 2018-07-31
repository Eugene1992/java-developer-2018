package JDBC_pckg.dao_pckg;

import java.util.List;

// TODO: 7/31/2018 E extends AbstractEntity
public interface GenericDao<ID, E> {

    E create(E employee);

    E update(E employee);

    boolean delete(ID id);

    E get(ID id);

    List<E> getAll();

    void close();
}