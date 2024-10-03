interface Shapes{
    void draw();
}
class Rectangle implements Shapes {
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Triangle implements Shapes{
    public void draw() {
        System.out.println("Triangle");
    }
}
abstract class ShapeFactory {
    abstract Shapes createShape();
}

class RectangleFactory extends ShapeFactory {
    public Shapes createShape() {
        return new Rectangle();
    }
}

class TringleFactory extends ShapeFactory {
    public Shapes createShape() {
        return new Triangle();
    }
}
