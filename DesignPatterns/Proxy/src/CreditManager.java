public class CreditManager extends CreditBase {

    @Override
    public int Calculate() throws InterruptedException {
        int result = 1;
        for (int i = 1; i < 5; i++) {
            result *= i;
            Thread.sleep(1000);
        }

        return result;
    }
}
