public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(new DbLoggerFactory());
        manager.save();
        manager.delete();
        manager.update();

        System.out.println("------------------------");

        manager = new Manager(new FileLoggerFactory());
        manager.save();
        manager.delete();
        manager.update();
    }
}
