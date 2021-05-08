package odev5.core.abstracts;

import odev5.entities.abstracts.Entity;
import odev5.entities.concretes.Customer;

public interface LoggerService {

	void logToUser(Customer customer);

}
