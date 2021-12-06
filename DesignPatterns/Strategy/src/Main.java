public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.setTuitionCalculatorBase(new Before2020TuitionCalculator());
        studentManager.saveTuition();

        studentManager.setTuitionCalculatorBase(new After2020TuitionCalculator());
        studentManager.saveTuition();
    }
}
