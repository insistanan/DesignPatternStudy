package 创建型模式.简单工厂模式.demo;

public class HistogramChart implements Chart{
    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
