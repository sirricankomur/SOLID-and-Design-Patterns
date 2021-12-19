public class DeletedState implements IState {
    @Override
    public void doAction(Context context) {
        System.out.println("State : Deleted");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Mevcut State: Deleted";
    }

}
