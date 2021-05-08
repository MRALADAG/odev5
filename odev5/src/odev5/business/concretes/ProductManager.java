package odev5.business.concretes;

import java.util.ArrayList;

import odev5.business.abstracts.ProductService;
import odev5.dataAccess.abstracts.ProductDao;
import odev5.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {

		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {

		if (product.getUnitInStock() > 1) {

			productDao.add(product);

		} else {

			System.out.println("Ürün stoklarada kalmadýðý için ekelenemedi. ");
			return;
		}
	}

	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
