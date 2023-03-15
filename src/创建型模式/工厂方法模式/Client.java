package 创建型模式.工厂方法模式;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();//可引入配置文件和反射机制来实现这一部分
        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
