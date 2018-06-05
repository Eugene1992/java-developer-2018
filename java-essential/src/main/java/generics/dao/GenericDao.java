package generics.dao;

public interface GenericDao<ID, T> {
    T get(ID id);

    void save(T type);

    void delete(ID id);

    void update(ID id, T type);
}
