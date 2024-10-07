public class Client {
    private AbstractFactory.AbstractProductA productA;
    private AbstractFactory.AbstractProductB productB;

    public Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void run() {
        System.out.println(productA.operationA());
        System.out.println(productB.operationB());
    }
}
