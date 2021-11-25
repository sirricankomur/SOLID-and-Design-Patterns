package entity;

import abstracts.service.IEatService;
import abstracts.service.IPayService;
import abstracts.service.IWorkService;
import abstracts.service.IWorker;

public class Employee extends Person implements IWorker {
    private String employeeNumber;
    private double pay;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
