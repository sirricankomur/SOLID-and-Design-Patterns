public class Manager {
    private ILogger logger;

    public Manager(ILogger logger) {
        this.logger = logger;
    }

    public void save(){
        logger.log("Kullanıcı verisi");
        System.out.println("Kaydedildi.");
    }
}
