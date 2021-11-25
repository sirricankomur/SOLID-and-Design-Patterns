public class Customer extends Person {
    private String city;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    void display() {
        System.out.println("Customer: " + getId() + " " + getFirstName() + " " + getLastName() + " " + getCity());
    }
}
