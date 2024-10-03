public class Singleton {
    private static Singleton shape;

    private Singleton() {}

    public static Singleton getInstance() {
        if (shape == null) {
            shape = new Singleton();
        }
        return shape;
    }
}