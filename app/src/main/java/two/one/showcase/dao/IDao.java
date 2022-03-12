package two.one.showcase.dao;

import java.util.List;
import java.util.Optional;

import two.one.showcase.beans.Produit;

public interface IDao<T> {
    boolean create(T o);

    boolean update(T o);

    boolean remove(T o);

    List<T> findAll();

    Optional<Produit> findById(int id);


}
