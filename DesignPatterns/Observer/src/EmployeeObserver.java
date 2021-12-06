public class EmployeeObserver extends Observer {

    @Override
    public void update() {
        System.out.println("Sayın Çalışan, ürün fiyatı değişti.");
    }
}
