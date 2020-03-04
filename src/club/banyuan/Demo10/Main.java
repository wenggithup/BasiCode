package club.banyuan.Demo10;

import club.banyuan.Demo03.MyInterface;
import org.junit.Test;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

         String a= show(()->"胡歌");
        System.out.println(a);

        Stream<String> s1 = Stream.of("1", "2", "3");
        s1.forEach((s)-> System.out.println(s));
    }
    @Test
    private static String show(MyInerface my) {
        System.out.println("多得多");
      return   my.method();
    }
    @Test
    void show2(){

    }
}
