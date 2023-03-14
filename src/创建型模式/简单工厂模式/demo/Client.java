package 创建型模式.简单工厂模式.demo;

public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("Histogram");
        chart.display();
    }
}
