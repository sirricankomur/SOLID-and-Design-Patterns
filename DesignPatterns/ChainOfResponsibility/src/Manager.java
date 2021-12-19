public class Manager extends ExpenseHandlerBase {

    @Override
    public void handleExpense(Expense expense) {
        if (expense.getAmount() <= 5000) {
            System.out.println("Manager imzayı üstlendi!");
        } else if (Successor != null) {
            Successor.handleExpense(expense);
        }
    }
}
