package 创建型模式.工厂方法模式;

public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
