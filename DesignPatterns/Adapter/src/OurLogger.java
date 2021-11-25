public class OurLogger implements ILogger {

    @Override
    public void log(String data) {
        System.out.println("Bizim loglama yöntemimizle loglandı.\tData: " + data);
    }
}
