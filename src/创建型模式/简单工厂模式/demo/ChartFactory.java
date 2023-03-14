package 创建型模式.简单工厂模式.demo;

public class ChartFactory {
    public Chart getChart(String type){
        Chart chart = null;
        if (type.equalsIgnoreCase("Pie")){
            chart = new PieChart();
        } else if (type.equalsIgnoreCase("Histogram")) {
            chart = new HistogramChart();
        } else if (type.equalsIgnoreCase("Line")) {
            chart = new LineChart();
        }
        return chart;
    }
}
