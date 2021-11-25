import concrete.EmployeeManager;
import entity.Employee;

public class Main {

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.add(new Employee());
        employeeManager.delete();
        employeeManager.getAll();
        System.out.println("Güncel Maaş: " + employeeManager.calculateSalary(3000));
    }
}
