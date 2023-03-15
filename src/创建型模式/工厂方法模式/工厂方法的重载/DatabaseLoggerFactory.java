package 创建型模式.工厂方法模式.工厂方法的重载;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //使用默认方式连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        //使用参数args连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        //使用封装在参数obj中的连接字符串来连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
