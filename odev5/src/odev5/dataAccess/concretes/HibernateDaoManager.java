package odev5.dataAccess.concretes;

import java.util.ArrayList;

import odev5.dataAccess.abstracts.ProductDao;
import odev5.entities.concretes.Product;

public class HibernateDaoManager implements ProductDao {

	@Override
	public void add(Product product) {

		System.out.println("Ürün Hibernate ile eklendi. " + product.getProductName());
	}

	@Override
	public void delete(Product product) {

		System.out.println("Ürün Hibernate ile silindi.");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Ürün Hibernate ile güncellendi.");
	}

	@Override
	public Product get(int productId) {

		return null;
	}

	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
