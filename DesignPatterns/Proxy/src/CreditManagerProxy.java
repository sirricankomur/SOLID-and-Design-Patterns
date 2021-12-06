public class CreditManagerProxy extends CreditBase {
    private CreditManager creditManager;
    private int cachedValue;

    @Override
    public int Calculate() throws InterruptedException {
        if (creditManager == null) {
            creditManager = new CreditManager();
            cachedValue = creditManager.Calculate();
        }

        return cachedValue;
    }
}
