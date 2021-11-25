public class Main {

    public static void main(String[] args) {
        var manager = Manager.createAsSingleton();
        manager.Save();
        manager.Delete();
        manager.Update();
    }
}
