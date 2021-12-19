public class StubLogger implements ILogger {
    private static StubLogger stubLogger;
    private static Object lock = new Object();

    private StubLogger() {
    }

    public static StubLogger getLogger() {
        synchronized (lock) {
            if (stubLogger == null) {
                stubLogger = new StubLogger();
            }
        }
        return stubLogger;
    }

    @Override
    public void log() {
    }
}
