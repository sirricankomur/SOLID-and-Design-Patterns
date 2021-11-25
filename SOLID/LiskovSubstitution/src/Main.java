import concrete.CustomerManager;
import concrete.EmployeeManager;
import concrete.apache.ApacheEmployeeDal;
import concrete.hibernate.HibernateCustomerDal;
import entity.Customer;
import entity.Employee;

public class Main {

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager(new ApacheEmployeeDal());
        employeeManager.add(new Employee());
        employeeManager.delete();
        employeeManager.getAll();
        employeeManager.calculateSalary(3000);

        System.out.println("---------------------------------------");

        CustomerManager customerManager = new CustomerManager(new HibernateCustomerDal());
        customerManager.add(new Customer());
        customerManager.delete();
        customerManager.getAll();
    }
}
