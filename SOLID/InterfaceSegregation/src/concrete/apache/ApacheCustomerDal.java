package concrete.apache;

import abstracts.dal.ICustomerDal;
import entity.Customer;

public class ApacheCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("Customer, Apache ile eklendi.");
    }

    @Override
    public void delete() {
        System.out.println("Customer, Apache ile silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Her Customer, Apache ile listelendi.");
    }

}
