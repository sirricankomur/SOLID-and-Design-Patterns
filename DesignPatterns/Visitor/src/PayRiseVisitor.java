public class PayRiseVisitor extends VisitorBase {
    @Override
    public void visit(Worker worker) {
        System.out.println(worker.name + " isimli çalışanın maaşı " + worker.salary * 0.1 + " lira zamlandı.");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.name + " isimli yöneticisine maaşı " + manager.salary * 0.2 + " lira zamlandı.");
    }
}
