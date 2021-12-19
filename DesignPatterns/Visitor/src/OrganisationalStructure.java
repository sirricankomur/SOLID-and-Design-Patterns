public class OrganisationalStructure {
    public EmployeeBase Employee;

    public OrganisationalStructure(EmployeeBase firstEmployee) {
        Employee = firstEmployee;
    }

    public void accept(VisitorBase visitor) {
        Employee.accept(visitor);
    }
}
