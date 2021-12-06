public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        VicePresident vicePresident = new VicePresident();
        President president = new President();

        manager.SetSuccessor(vicePresident);
        vicePresident.SetSuccessor(president);

        Expense expense = new Expense();
        expense.setDetail("Reklam verme");
        expense.setAmount(6000);
        manager.HandleExpense(expense);
    }
}
