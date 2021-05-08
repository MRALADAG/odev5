package odev5.business.abstracts;

import java.util.ArrayList;

import odev5.entities.concretes.Product;

public interface ProductService {

	void add(Product product);

	ArrayList<Product> getAll();
}
