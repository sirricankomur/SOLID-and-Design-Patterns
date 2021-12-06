public class Main {

    public static void main(String[] args) {
        CreditBase manager = new CreditManagerProxy();
        try {
            System.out.println(manager.Calculate());
            System.out.println(manager.Calculate());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
