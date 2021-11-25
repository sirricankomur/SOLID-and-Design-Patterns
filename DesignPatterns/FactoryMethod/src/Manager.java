public class Manager {
    private ILoggerFactory _loggerFactory;

    public Manager(ILoggerFactory loggerFactory){
        _loggerFactory = loggerFactory;
    }

    public void save(){
        ILogger logger = _loggerFactory.createLogger();
        logger.log();
        System.out.println("Kaydedildi.");
    }

    public void delete(){
        ILogger logger = _loggerFactory.createLogger();
        logger.log();
        System.out.println("Silindi.");
    }

    public void update(){
        ILogger logger = _loggerFactory.createLogger();
        logger.log();
        System.out.println("Güncellendi.");
    }

}
