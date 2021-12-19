import java.util.HashMap;
import java.util.UUID;

public class Camera {
    static HashMap<String, Camera> cameras = new HashMap<String, Camera>();
    static Object lock = new Object();
    public UUID id;

    private Camera() {
        id = UUID.randomUUID();
    }

    public static Camera getCamera(String brand) {
        synchronized (lock) {
            if (!cameras.containsKey(brand)) {
                cameras.put(brand, new Camera());
            }
        }
        return cameras.get(brand);
    }
}
