package club.banyuan.Demo02.sendRed;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Manager manager=new Manager("群主",200);
        Person person1 = new Person("成员A", 50);
        Person person2 = new Person("成员B", 0);
        Person person3 = new Person("成员C", 30);
        Person person4 = new Person("成员D", -20);
        System.out.println(manager.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println("==================================");

        ArrayList list = manager.send(50, 4);
        person1.recieve(list);
        person2.recieve(list);
        person3.recieve(list);
        person4.recieve(list);
        System.out.println(manager.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
    }
}
