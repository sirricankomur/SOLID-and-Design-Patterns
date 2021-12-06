public class StudentManager {
    private TuitionCalculatorBase tuitionCalculatorBase;

    public void saveTuition() {
        System.out.println("Okul ücreti kaydedildi.");
        tuitionCalculatorBase.calculate();
    }

    public TuitionCalculatorBase getTuitionCalculatorBase() {
        return tuitionCalculatorBase;
    }

    public void setTuitionCalculatorBase(TuitionCalculatorBase tuitionCalculatorBase) {
        this.tuitionCalculatorBase = tuitionCalculatorBase;
    }
}
