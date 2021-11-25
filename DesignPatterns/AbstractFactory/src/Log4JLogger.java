public class Log4JLogger extends Logging {

    @Override
    public void log(String message) {
        System.out.println("Log4J ile loglandı.");
    }
}
