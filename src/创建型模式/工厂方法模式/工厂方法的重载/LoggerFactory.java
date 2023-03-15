package 创建型模式.工厂方法模式.工厂方法的重载;

public interface LoggerFactory {
    public Logger createLogger();
    public Logger createLogger(String args);
    public Logger createLogger(Object obj);

}
