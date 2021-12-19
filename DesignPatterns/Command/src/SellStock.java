public class SellStock implements IOrder {
    private StockManager stockManager;

    public SellStock(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    @Override
    public void execute() {
        stockManager.sell();
    }

}
