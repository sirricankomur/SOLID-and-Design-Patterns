import java.util.ArrayList;

public class StockController {
    ArrayList<IOrder> orders = new ArrayList<IOrder>();

    public void takeOrder(IOrder order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (var order : orders) {
            order.execute();
        }

        orders.clear();
    }
}
