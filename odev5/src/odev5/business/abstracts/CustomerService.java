package odev5.business.abstracts;

import odev5.entities.abstracts.Entity;
import odev5.entities.concretes.Customer;

public interface CustomerService {

	void add(Customer customer);

	void del(Customer customer);

	void update(Customer customer);

	void add();
}
