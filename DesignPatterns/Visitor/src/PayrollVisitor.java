public class PayrollVisitor extends VisitorBase {
    @Override
    public void visit(Worker worker) {
        System.out.println(worker.name + " isimli çalışana " + worker.salary * 1.1 + " ödendi.");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.name + " isimli yöneticiye " + manager.salary * 1.2 + " ödendi.");
    }
}
