package 创建型模式.工厂方法模式;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        return logger;
    }
}
