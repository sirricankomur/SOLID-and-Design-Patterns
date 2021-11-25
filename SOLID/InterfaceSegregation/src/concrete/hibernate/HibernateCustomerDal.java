package concrete.hibernate;

import abstracts.dal.ICustomerDal;
import entity.Customer;

public class HibernateCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("Customer, Hibernate ile eklendi.");
    }

    @Override
    public void delete() {
        System.out.println("Customer, Hibernate ile silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Her Customer, Hibernate ile listelendi.");
    }

}
