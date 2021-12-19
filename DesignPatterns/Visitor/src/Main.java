public class Main {

    public static void main(String[] args) {
        Manager sirri = new Manager();
        sirri.name = "Sırrı";
        sirri.salary = 7000;

        Manager can = new Manager();
        can.name = "Can";
        can.salary = 5000;

        Worker ali = new Worker();
        ali.name = "Ali";
        ali.salary = 3000;

        Worker fatma = new Worker();
        fatma.name = "Fatma";
        fatma.salary = 3000;

        sirri.subordinates.add(can);
        can.subordinates.add(ali);
        can.subordinates.add(fatma);

        OrganisationalStructure organisationalStructure = new OrganisationalStructure(sirri);

        PayRiseVisitor payriseVisitor = new PayRiseVisitor();
        PayrollVisitor payrollVisitor = new PayrollVisitor();

        organisationalStructure.accept(payriseVisitor);
        organisationalStructure.accept(payrollVisitor);
    }
}
