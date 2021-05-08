package odev5.core.concretes;

import odev5.core.abstracts.LoggerService;
import odev5.entities.concretes.Customer;

public class EmailLoggerManager implements LoggerService {

	private Customer customer;

	public EmailLoggerManager(Customer customer) {

		this.customer = customer;
	}

	@Override
	public void logToUser(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Email ile loglandý. " + customer.getFirstName());
	}

}
