public class SpecialOffer extends CarDecoratorBase {
    private int discountPercentage;
    private CarBase carBase;
    private String make;
    private String model;
    private double hirePrice;


    public SpecialOffer(CarBase carBase) {
        super(carBase);
        this.carBase = carBase;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getHirePrice() {
        return carBase.getHirePrice() - carBase.getHirePrice() * discountPercentage / 100;
    }
}
