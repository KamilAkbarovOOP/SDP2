public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);


        ShapeFactory factory = new RectangleFactory();
        Shapes shape = factory.createShape();
        shape.draw();


        Shape circle = new Circle();
        Shape square = new Square();
        Shape clonedCircle = circle.clone();
        clonedCircle.draw();
    }
}