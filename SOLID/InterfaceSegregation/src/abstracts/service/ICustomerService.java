package abstracts.service;

import entity.Customer;

public interface ICustomerService {
    void add(Customer customer);
    void delete();
    void getAll();
}
