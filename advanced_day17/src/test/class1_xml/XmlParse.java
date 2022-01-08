package test.class1_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParse {
    public static void main(String[] args) throws DocumentException {
        //获取一个解析器对象
        SAXReader saxReader = new SAXReader();
        //利用解析器把xml加载到内存中，并返回一个文档对象
        Document document = saxReader.read(new File("advanced_day17/src/xml/student.xml"));
        //获取根标签
        Element rootElement = document.getRootElement();
        //通过根标签获取Student对象  --空参，会拿到所有子标签
        List list = rootElement.elements();
        System.out.println(list.size());

        //elements("标签名")
        ArrayList<Student> arrayList = new ArrayList<>();
        List<Element> studentElements = rootElement.elements("student");
        for (Element studentElement : studentElements) {
            Attribute idAttribute = studentElement.attribute("id");
            String id = idAttribute.getValue();
            //获取name标签
            Element nameElement = studentElement.element("name");
            //获取标签体内容
            String name = nameElement.getText();

            //获取age标签
            Element ageElement = studentElement.element("age");
            //获取标签体内容
            String age = ageElement.getText();
            arrayList.add(new Student(id,name,Integer.parseInt(age)));


        }
        for (Student student : arrayList) {
            System.out.println(student);
        }


    }
}
