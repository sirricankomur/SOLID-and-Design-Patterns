public class Main {

    public static void main(String[] args) {
        Camera camera1 = Camera.getCamera("Nikon");
        Camera camera2 = Camera.getCamera("Nikon");
        Camera camera3 = Camera.getCamera("Canon");
        Camera camera4 = Camera.getCamera("Canon");

        System.out.println(camera1.id);
        System.out.println(camera2.id);
        System.out.println(camera3.id);
        System.out.println(camera4.id);
    }
}
