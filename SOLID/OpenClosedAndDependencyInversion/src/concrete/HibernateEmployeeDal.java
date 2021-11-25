package concrete;

import abstracts.IEmployeeDal;
import entity.Employee;

public class HibernateEmployeeDal implements IEmployeeDal {
    @Override
    public void add(Employee employee) {
        System.out.println("Employee, Hibernate ile eklendi.");
    }

    @Override
    public void delete() {
        System.out.println("Employee, Hibernate ile silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Her Employee, Hibernate ile listelendi.");
    }
}
