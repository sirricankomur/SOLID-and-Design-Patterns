public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.MessageSenderBase = new EmailSender();
        manager.UpdateCustomer();
    }
}
