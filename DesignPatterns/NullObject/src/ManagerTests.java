public class ManagerTests {
    public void saveTest() {
        Manager customerManager = new Manager(StubLogger.getLogger());
        customerManager.save();
    }
}
