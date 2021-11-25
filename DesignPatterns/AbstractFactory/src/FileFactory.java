public class FileFactory extends CrossCuttingConcernsFactory {

    @Override
    public Logging creatLogging() {
        return new ApacheLogger();
    }

    @Override
    public Caching creatCaching() {
        return new MemcachedCache();
    }
}
