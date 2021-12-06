public class Main {

    public static void main(String[] args) {
        CustomerObserver customerObserver = new CustomerObserver();
        EmployeeObserver employeeObserver = new EmployeeObserver();

        ProductManager productManager = new ProductManager();
        productManager.attach(customerObserver);
        productManager.attach(employeeObserver);
        productManager.updatePrice();

        productManager.detach(customerObserver);
    }
}
