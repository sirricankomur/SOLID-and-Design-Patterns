public class Manager implements IService {


    private CrossCuttingConcernsFactory _crossCuttingConcernsFactory;

    private Logging _logging;
    private Caching _caching;

    public Manager(CrossCuttingConcernsFactory crossCuttingConcernsFactory) {
        _crossCuttingConcernsFactory = crossCuttingConcernsFactory;
        _logging = _crossCuttingConcernsFactory.creatLogging();
        _caching = _crossCuttingConcernsFactory.creatCaching();
    }

    @Override
    public void getAll() {
        _logging.log("Message");
        _caching.cache("Data");
        System.out.println("Listelendi.");
    }

}


