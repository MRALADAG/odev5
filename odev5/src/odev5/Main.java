package odev5;

import odev5.business.abstracts.CustomerService;
import odev5.business.abstracts.ProductService;
import odev5.business.concretes.CustomerManager;
import odev5.business.concretes.ProductManager;
import odev5.core.concretes.GoogleAccountManagerAdapter;
import odev5.dataAccess.concretes.FakeDaoManager;
import odev5.dataAccess.concretes.HibernateDaoManager;
import odev5.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(1, 1, "Elma", 6490, 5);

		ProductService productManager = new ProductManager(new FakeDaoManager());
		productManager.add(product);

		CustomerService customerService = new CustomerManager(new GoogleAccountManagerAdapter("Engin.Demirog"));
		customerService.add();

	}

}
