public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(new OurLogger());
        manager.save();

        manager = new Manager(new Log4JAdapter());
        manager.save();
    }
}
