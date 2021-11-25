package concrete;

import abstracts.dal.IEmployeeDal;
import abstracts.service.*;
import entity.Employee;

public class EmployeeManager implements IEmployeeService, IWorkService, IPayService, IEatService {
    private IEmployeeDal _employeeDal;
    private IWorker _worker;

    public EmployeeManager(IEmployeeDal employeeDal, Employee employee) {
        _employeeDal = employeeDal;
        _worker = employee;
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
    public void calculateMealCard() {
        System.out.println("Employee, yemek kartı hizmeti hesaplandı.");
    }


    @Override
    public void calculateWorkingHour() {
        System.out.println("Employee, çalışma saati hesaplandı.");
    }

    @Override
    public void calculatePay() {
        System.out.println("Employee, ücret hesaplandı.");
    }
}
