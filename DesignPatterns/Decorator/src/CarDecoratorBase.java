public class CarDecoratorBase extends CarBase {
    private CarBase carBase;

    protected CarDecoratorBase(CarBase carBase) {
        this.carBase = carBase;
    }
}
