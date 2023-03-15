package 创建型模式.抽象工厂模式;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory;
        factory = new ConcreteFactory1();
        AbstractProductA productA;
        AbstractProductB productB;
        productA = factory.createProductA();
    }
}
