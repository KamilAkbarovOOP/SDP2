public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new AbstractFactory.ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.run();


        AbstractFactory factory2 = new AbstractFactory.ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.run();

        ComplexObject complexObject1 = new ComplexObject.Builder()
                .setObjectA("ObjectA1")
                .setObjectB("ObjectB1")
                .setObjectC("ObjectC1")
                .build();

        System.out.println(complexObject1);
        ComplexObject complexObject2 = new ComplexObject.Builder()
                .setObjectA("ObjectA2")
                .setObjectB("ObjectB2")
                .build();

        System.out.println(complexObject2);
    }
}
