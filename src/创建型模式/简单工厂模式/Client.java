package 创建型模式.简单工厂模式;

public class Client {
    public static void main(String[] args) {
        Product product;
        //通过工厂类创建产品对象
        product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}
