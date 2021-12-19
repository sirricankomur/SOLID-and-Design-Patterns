public abstract class EmployeeBase {
    public String name;
    public double salary;

    public abstract void accept(VisitorBase visitor);
}
