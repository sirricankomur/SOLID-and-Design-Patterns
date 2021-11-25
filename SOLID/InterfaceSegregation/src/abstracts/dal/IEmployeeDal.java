package abstracts.dal;

import entity.Employee;

public interface IEmployeeDal {
    void add(Employee employee);
    void delete();
    void getAll();
}
