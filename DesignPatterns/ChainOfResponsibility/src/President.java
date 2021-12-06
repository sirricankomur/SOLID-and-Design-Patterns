public class President extends ExpenseHandlerBase {
    @Override
    public void HandleExpense(Expense expense) {
        if (expense.getAmount() > 10000) {
            System.out.println("President imzayı üstlendi!");
        }
    }
}
