package concrete;

import abstracts.dal.ICustomerDal;
import abstracts.service.ICustomerService;
import entity.Customer;

public class CustomerManager implements ICustomerService {
    private ICustomerDal _customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        _customerDal = customerDal;
    }

    @Override
    public void add(Customer customer) {
        _customerDal.add(customer);
    }

    @Override
    public void delete() {
        _customerDal.delete();
    }

    @Override
    public void getAll() {
        _customerDal.getAll();
    }
}
