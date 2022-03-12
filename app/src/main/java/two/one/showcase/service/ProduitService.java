package two.one.showcase.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import two.one.showcase.beans.Produit;
import two.one.showcase.dao.IDao;

public class ProduitService implements IDao<Produit> {
   private static List<Produit> pizza = new ArrayList<>();

    @Override
    public boolean create(Produit o) {
   return pizza.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean remove(Produit o) {
        return pizza.remove(o);
    }

    @Override
    public List<Produit> findAll() {
        return pizza;
    }

    @Override
    public Optional<Produit> findById(int id) {

        return pizza.stream().filter(p -> p.getId() == id).findFirst();
    }
}
