package odev5.dataAccess.concretes;

import java.util.ArrayList;

import odev5.dataAccess.abstracts.ProductDao;
import odev5.entities.concretes.Product;

public class FakeDaoManager implements ProductDao {

	@Override
	public void add(Product product) {

		System.out.println("Ürün Fake sisteme eklendi. " + product.getProductName());

	}

	@Override
	public void delete(Product product) {

		System.out.println("Ürün Fake olarak ile silindi.");

	}

	@Override
	public void update(Product product) {

		System.out.println("Ürün Fake olarak ile güncellendi.");

	}

	@Override
	public Product get(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
