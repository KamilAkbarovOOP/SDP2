public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
    class ConcreteFactory1 implements AbstractFactory {
        @Override
        public AbstractProductA createProductA() {
            return new ProductA1();
        }

        @Override
        public AbstractProductB createProductB() {
            return new ProductB1();
        }
    }
    class ConcreteFactory2 implements AbstractFactory {
        @Override
        public AbstractProductA createProductA() {
            return new ProductA2();
        }

        @Override
        public AbstractProductB createProductB() {
            return new ProductB2();
        }
    }
    interface AbstractProductA {
        String operationA();
    }


    interface AbstractProductB {
        String operationB();
    }


    class ProductA1 implements AbstractProductA {
        @Override
        public String operationA() {
            return "ПродуктA1 работает";
        }
    }

    class ProductA2 implements AbstractProductA {
        @Override
        public String operationA() {
            return "ПродуктA2 работает";
        }
    }

    class ProductB1 implements AbstractProductB {
        @Override
        public String operationB() {
            return "ПродуктB1 работает";
        }
    }


    class ProductB2 implements AbstractProductB {
        @Override
        public String operationB() {
            return "ПродуктB2 работает";
        }
    }
}
