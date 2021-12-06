public class CustomerObserver extends Observer {

    @Override
    public void update() {
        System.out.println("Sayın Müşteri, ürün fiyatı değişti.");
    }
}
