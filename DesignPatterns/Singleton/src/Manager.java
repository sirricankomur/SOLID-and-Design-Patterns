

public class Manager {

    private static Manager _manager;

    private Manager(){}

    public static Manager createAsSingleton(){
        if (_manager == null){
            _manager = new Manager();
        }

        return _manager;
    }
}




