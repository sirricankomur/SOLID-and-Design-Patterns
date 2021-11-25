public class DbFactory extends CrossCuttingConcernsFactory {
    @Override
    public Logging creatLogging() {
        return new Log4JLogger();
    }

    @Override
    public Caching creatCaching() {
        return new RedisCache();
    }
}
