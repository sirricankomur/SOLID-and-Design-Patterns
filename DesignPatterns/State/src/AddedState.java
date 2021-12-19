public class AddedState implements IState {
    @Override
    public void doAction(Context context) {
        System.out.println("State : Added");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Mevcut State: Added";
    }
}
