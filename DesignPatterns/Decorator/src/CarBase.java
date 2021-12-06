public abstract class CarBase {
    private String make;
    private String model;
    private double hirePrice;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHirePrice() {
        return hirePrice;
    }

    public void setHirePrice(double hirePrice) {
        this.hirePrice = hirePrice;
    }
}
