public class Log4JAdapter implements ILogger {
    @Override
    public void log(String data) {
        Log4J log4J = new Log4J();
        log4J.logData(data);
    }
}
