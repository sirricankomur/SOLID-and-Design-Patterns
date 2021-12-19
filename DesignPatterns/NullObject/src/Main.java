public class Main {

    public static void main(String[] args) {
        Manager customerManager = new Manager(StubLogger.getLogger());
        customerManager.save();
    }
}
