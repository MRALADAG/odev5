package odev5.business.concretes;

import odev5.business.abstracts.CustomerService;
import odev5.core.abstracts.AccountService;
import odev5.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private AccountService accountService;

	public CustomerManager() {

	}

	public CustomerManager(AccountService accountService) {

		this.accountService = accountService;
	}

	@Override
	public void add(Customer customer) {

		System.out.println("Sisteme üye oldunuz." + customer.getFirstName());

	}

	@Override
	public void add() {

		this.accountService.accountAdd();

	}

	@Override
	public void del(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

}
