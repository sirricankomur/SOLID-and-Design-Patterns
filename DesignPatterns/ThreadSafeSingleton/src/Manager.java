public class Manager {
    private static Manager _manager;
    private Manager(){

    }

    public synchronized static Manager createAsSingleton(){
        if (_manager == null){
            _manager = new Manager();
        }

        return _manager;
    }

    public static Manager createAsSingleton2(){
        synchronized (Manager.class){
            if (_manager == null){
                _manager = new Manager();
            }
        }

        return _manager;
    }

    public void Save(){
        System.out.println("Kaydedildi.");
    }

    public void Delete(){
        System.out.println("Silindi.");
    }

    public void Update(){
        System.out.println("Güncellendi.");
    }
}
