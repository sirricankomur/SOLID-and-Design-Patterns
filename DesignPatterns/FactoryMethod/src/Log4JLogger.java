public class Log4JLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Log4J ile loglandı.");
    }
}
