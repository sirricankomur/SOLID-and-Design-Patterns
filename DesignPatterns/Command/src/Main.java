public class Main {

    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
        BuyStock buyStock = new BuyStock(stockManager);
        SellStock sellStock = new SellStock(stockManager);

        StockController stockController = new StockController();

        stockController.takeOrder(buyStock);
        stockController.takeOrder(sellStock);
        stockController.takeOrder(buyStock);

        stockController.placeOrders();
    }
}
