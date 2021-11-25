import concrete.ApacheEmployeeDal;
import concrete.EmployeeManager;
import concrete.HibernateEmployeeDal;
import entity.Employee;

public class Main {

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager(new ApacheEmployeeDal());
        employeeManager.add(new Employee());
        employeeManager.delete();
        employeeManager.getAll();
        employeeManager.calculateSalary(3000);

        System.out.println("---------------------------------------");

        employeeManager = new EmployeeManager(new HibernateEmployeeDal());
        employeeManager.add(new Employee());
        employeeManager.delete();
        employeeManager.getAll();
        employeeManager.calculateSalary(3000);
    }
}
