package odev5.dataAccess.abstracts;

import java.util.ArrayList;

import odev5.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	Product get(int productId);
	ArrayList<Product> getAll();
}
