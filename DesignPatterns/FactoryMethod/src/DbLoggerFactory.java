public class DbLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new Log4JLogger();
    }
}
