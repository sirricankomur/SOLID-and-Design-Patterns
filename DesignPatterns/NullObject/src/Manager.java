public class Manager {
    private ILogger logger;

    public Manager(ILogger logger) {
        this.logger = logger;
    }

    public void save() {
        System.out.println("Kaydedildi");
        logger.log();
    }
}
