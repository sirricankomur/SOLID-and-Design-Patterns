package abstracts.dal;

import entity.Customer;

public interface ICustomerDal {
    void add(Customer customer);
    void delete();
    void getAll();
}
