public class VicePresident extends ExpenseHandlerBase {
    @Override
    public void HandleExpense(Expense expense) {
        if (expense.getAmount() > 5000 && expense.getAmount() <= 10000) {
            System.out.println("VicePresident imzayı üstlendi!");
        } else if (Successor != null) {
            Successor.HandleExpense(expense);
        }
    }
}
