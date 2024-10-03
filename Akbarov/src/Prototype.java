interface Shape {
    void draw();
    Shape clone();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
    public Shape clone() {
        return new Circle();
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square");
    }
    public Shape clone() {
        return new Square();
    }
}