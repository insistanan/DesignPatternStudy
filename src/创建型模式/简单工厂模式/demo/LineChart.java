package 创建型模式.简单工厂模式.demo;

public class LineChart implements Chart{
    public LineChart() {
        System.out.println("创建折线图");
    }
    @Override
    public void display(){
        System.out.println("显示折线图");
    }
}
