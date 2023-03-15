package 创建型模式.工厂方法模式.工厂方法的重载;

import 创建型模式.工厂方法模式.工厂方法的重载.反射机制与配置文件.XMLUtil;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        //可引入配置文件和反射机制来实现这一部分
        factory = (LoggerFactory) XMLUtil.getBean();

        Logger logger;
        logger = factory.createLogger();
        
        logger.writeLog();
    }
}
