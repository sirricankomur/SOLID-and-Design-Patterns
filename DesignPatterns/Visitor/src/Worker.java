public class Worker extends EmployeeBase {

    @Override
    public void accept(VisitorBase visitor) {
        visitor.visit(this);
    }
}
