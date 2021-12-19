public class VicePresident extends ExpenseHandlerBase {
    @Override
    public void handleExpense(Expense expense) {
        if (expense.getAmount() > 5000 && expense.getAmount() <= 10000) {
            System.out.println("VicePresident imzayı üstlendi!");
        } else if (Successor != null) {
            Successor.handleExpense(expense);
        }
    }
}
