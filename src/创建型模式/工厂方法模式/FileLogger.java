package 创建型模式.工厂方法模式;

public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
