public class Manager extends ExpenseHandlerBase {

    @Override
    public void HandleExpense(Expense expense) {
        if (expense.getAmount() <= 5000) {
            System.out.println("Manager imzayı üstlendi!");
        } else if (Successor != null) {
            Successor.HandleExpense(expense);
        }
    }
}
