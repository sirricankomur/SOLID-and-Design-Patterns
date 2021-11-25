public class FileLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new ApacheLogger();
    }
}
