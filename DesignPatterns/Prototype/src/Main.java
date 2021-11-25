public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Sırrı");
        customer1.setLastName("KÖMÜR");
        customer1.setCity("İzmir");

       // System.out.println(customer1.getId() + " " + customer1.getFirstName() + " " + customer1.getLastName() + " " + customer1.getCity());

        customer1.display();

        Customer customer2 = (Customer) customer1.clone();
        customer2.setFirstName("Can");

        customer2.display();
      //  System.out.println(customer2.getId() + " " + customer2.getFirstName() + " " + customer2.getLastName() + " " + customer2.getCity());
    }
}
