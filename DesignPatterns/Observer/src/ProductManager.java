import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Observer> observers = new ArrayList<Observer>();

    public void updatePrice() {
        System.out.println("Ürünün fiyatı değişti.");
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyAllObservers() {
        for (var observer : observers) {
            observer.update();
        }
    }
}
