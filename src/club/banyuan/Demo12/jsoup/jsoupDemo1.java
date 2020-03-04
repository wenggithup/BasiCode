package club.banyuan.Demo12.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class jsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //获取document对象,根据xml文档获取
        // 2.1获取student.xml的path、
        String path=jsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2解析xml文档，加载文档进内存
        Document document= Jsoup.parse(new File(path), "utf-8");
        //3、获取元素对象 Element
        Elements elements = document.getElementsByTag("name");
        //System.out.println(elements.size());
        Element element = elements.get(0);
        String text = element.text();
        System.out.println(text);

    }
}
