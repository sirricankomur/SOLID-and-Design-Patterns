public class RedisCache extends Caching{
    @Override
    public void cache(String data) {
        System.out.println("Redis ile cachlendi.");
    }
}
