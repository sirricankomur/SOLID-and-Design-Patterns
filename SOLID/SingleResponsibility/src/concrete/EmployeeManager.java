package concrete;

import abstracts.IEmployeeService;
import entity.Employee;


public class EmployeeManager implements IEmployeeService {

    @Override
    public void add(Employee employee) {
        System.out.println("Employee eklendi.");
    }

    @Override
    public void delete() {
        System.out.println("Employee silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Her Employee listelendi.");
    }

    @Override
    public double calculateSalary(double salary) {
        return salary * 1.10; //Maaşa %10'luk zam eklendi.
    }
}
