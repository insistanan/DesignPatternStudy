package 创建型模式.工厂方法模式.工厂方法的重载;

public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
