package 创建型模式.简单工厂模式;

public class Factory {
    /**
     * 静态工厂方法，得到产品
     *
     * @param arg 参数
     * @return {@link Product}
     */
    public static Product getProduct(String arg){
        Product product = null;
        if (arg.equalsIgnoreCase("A")){
            product = new ConcreteProductA();
            //初始化设置product
        }else if (arg.equalsIgnoreCase("B")){
            product = new ConcreteProductB();
            //初始化设置product
        }
        return product;
    }
}
