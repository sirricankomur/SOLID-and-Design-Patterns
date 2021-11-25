package concrete.apache;

import abstracts.dal.IEmployeeDal;
import entity.Employee;

public class ApacheEmployeeDal implements IEmployeeDal {
    @Override
    public void add(Employee employee) {
        System.out.println("Employee, Apache ile eklendi.");
    }

    @Override
    public void delete() {
        System.out.println("Employee, Apache ile silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Her Employee, Apache ile listelendi.");
    }
}
