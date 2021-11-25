public class MemcachedCache extends Caching {
    @Override
    public void cache(String data) {
        System.out.println("Memcached ile cachlendi.");
    }
}
