public class BuyStock implements IOrder {
    private StockManager stockManager;

    public BuyStock(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    @Override
    public void execute() {
        stockManager.buy();
    }
}
