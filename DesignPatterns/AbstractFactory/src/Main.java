public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(new DbFactory());
        manager.getAll();

        System.out.println("------------------------");
        manager = new Manager(new FileFactory());
        manager.getAll();
    }
}
