package 创建型模式.工厂方法模式.工厂方法的重载;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //默认方式创建文件日志记录器对象
        Logger logger = new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        //参数方式
        Logger logger = new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        //obj参数方式
        Logger logger = new FileLogger();
        return logger;
    }
}
