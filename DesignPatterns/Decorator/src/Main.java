public class Main {

    public static void main(String[] args) {
        var personalCar = new PersonalCar("Mercedes", "Benz", 5000);

        SpecialOffer specialOffer = new SpecialOffer(personalCar);
        specialOffer.setDiscountPercentage(10);

        System.out.println("Concrete: " + personalCar.getHirePrice());
        System.out.println("Special offer: " + specialOffer.getHirePrice());
    }
}
