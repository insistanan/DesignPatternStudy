package 创建型模式.工厂方法模式.工厂方法的重载.反射机制与配置文件;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    /**
     * 该方法用于从XML配置文件中提取具体类的类名，并返回一个实例对象
     *
     * @return {@link Object}
     */
    public static Object getBean(){
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document document;
            document = builder.parse(new File("src//创建型模式//工厂方法模式//工厂方法的重载//反射机制与配置文件//config.xml"));

            //获取包含类目的文本节点
            NodeList nodeList = document.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object o = c.newInstance();
            return o;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
