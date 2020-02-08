package club.banyuan.Demo09.IO.Serializable;

import java.io.*;
import java.util.ArrayList;

public class out {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        show();

        show02();
    }

    private static void show02() throws IOException, ClassNotFoundException {
        ObjectInputStream oi=new ObjectInputStream(new FileInputStream("src/club/banyuan/Demo09/IO/Serializable/a.txt"));
        Object o = oi.readObject();
        ArrayList<Person> list=(ArrayList<Person>)o;
        for (Person person : list) {
            System.out.println(person);
        }

    }

    private static void show() throws IOException {
        ArrayList<Person> arrayList=new ArrayList<>();
        arrayList.add(new Person("张三",15));
        arrayList.add(new Person("李四",16));
        arrayList.add(new Person("王二",17));

        //创建序列化流
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("src/club/banyuan/Demo09/IO/Serializable/a.txt"));
        os.writeObject(arrayList);
        os.flush();
    }
}
