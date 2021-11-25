package abstracts.service;

import entity.Employee;

public interface IEmployeeService {
    void add(Employee employee);
    void delete();
    void getAll();
    double calculateSalary(double salary);
}
