public class CommercialCar extends CarBase {
    private String make;
    private String model;
    private double hirePrice;

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getHirePrice() {
        return hirePrice;
    }

    @Override
    public void setHirePrice(double hirePrice) {
        this.hirePrice = hirePrice;
    }
}
