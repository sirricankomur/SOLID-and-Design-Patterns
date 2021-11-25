public class Manager {
    private CrossCuttingConcernsFacade crossCuttingConcernsFacade;

    public Manager() {
        crossCuttingConcernsFacade = new CrossCuttingConcernsFacade();
    }

    public void save(){
        crossCuttingConcernsFacade.caching.cache();
        crossCuttingConcernsFacade.authorize.checkUser();
        crossCuttingConcernsFacade.logging.log();

        System.out.println("Kaydedildi.");
    }
}
