public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        AddedState added = new AddedState();
        added.doAction(context);
        ModifiedState modified = new ModifiedState();
        modified.doAction(context);
        DeletedState deleted = new DeletedState();
        deleted.doAction(context);

        System.out.println(context.getState().toString());
    }
}
