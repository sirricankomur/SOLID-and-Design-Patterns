public class CrossCuttingConcernsFacade {
    public ILogging logging;
    public ICaching caching;
    public IAuthorize authorize;

    public CrossCuttingConcernsFacade() {
        logging = new Logging();
        caching = new Caching();
        authorize = new Authorize();
    }

}
