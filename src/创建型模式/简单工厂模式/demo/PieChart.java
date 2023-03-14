package 创建型模式.简单工厂模式.demo;

public class PieChart implements Chart{
    public PieChart() {
        System.out.println("创建饼图");
    }

    @Override
    public void display() {
        System.out.println("显示饼图");
    }
}
