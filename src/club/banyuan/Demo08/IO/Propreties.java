package club.banyuan.Demo08.IO;

import club.banyuan.Demo09.IO.Serializable.Person;

import java.io.*;
import java.util.Properties;

public class Propreties {
    public static void main(String[] args) throws IOException {
        File file=new File("a.txt");
        System.out.println(file.getAbsoluteFile());

        show();
        show02();
    }

    private static void show02() throws IOException {
        Properties pro=new Properties();
        pro.load(new FileReader("src/club/banyuan/Demo08/IO/pro1.txt"));
        for (Object o:pro.keySet()){
            String str=(String)o;
            String value=pro.getProperty(str);
            System.out.println(str+"="+value);

        }
    }

    private static void show() throws IOException {
        Properties pro=new Properties();
        pro.setProperty("老二","chifan");
        pro.setProperty("老三","chifan");
        pro.setProperty("老死","chifan");


        pro.store(new FileWriter("src/club/banyuan/Demo08/IO/pro1.txt"),"sava data");
    }
}
