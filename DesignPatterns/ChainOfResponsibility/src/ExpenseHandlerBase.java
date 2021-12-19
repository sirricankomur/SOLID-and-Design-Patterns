public abstract class ExpenseHandlerBase {
    protected ExpenseHandlerBase Successor;

    public abstract void handleExpense(Expense expense);

    public void setSuccessor(ExpenseHandlerBase successor) {
        Successor = successor;
    }
}
