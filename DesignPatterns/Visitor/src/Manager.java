import java.util.ArrayList;

public class Manager extends EmployeeBase {
    public ArrayList<EmployeeBase> subordinates;

    public Manager() {
        subordinates = new ArrayList<EmployeeBase>();
    }

    @Override
    public void accept(VisitorBase visitor) {
        visitor.visit(this);

        for (var employee : subordinates) {
            employee.accept(visitor);
        }
    }
}
