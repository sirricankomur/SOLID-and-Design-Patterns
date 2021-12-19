public class StockManager {
    private String name = "Laptop";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stok Durumu: " + name + " ürününden " + quantity + " adet satın alındı!");
    }

    public void sell() {
        System.out.println("Stok Durumu: " + name + " ürününden " + quantity + " adet satıldı!");
    }
}
