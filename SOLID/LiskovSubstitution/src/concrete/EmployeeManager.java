package concrete;

import abstracts.dal.IEmployeeDal;
import abstracts.service.IEmployeeService;
import entity.Employee;

public class EmployeeManager implements IEmployeeService {
    private IEmployeeDal _employeeDal;

    public EmployeeManager(IEmployeeDal employeeDal) {
        _employeeDal = employeeDal;
    }

    @Override
    public void add(Employee employee) {
        _employeeDal.add(employee);
    }

    @Override
    public void delete() {
        _employeeDal.delete();
    }

    @Override
    public void getAll() {
        _employeeDal.getAll();
    }

    @Override
    public double calculateSalary(double salary) {
        return salary * 1.10; //Maaşa %10'luk zam eklendi.
    }

}
