public class ModifiedState implements IState{

    @Override
    public void doAction(Context context) {
        System.out.println("State : Modified");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Mevcut State: Modified";
    }

}
