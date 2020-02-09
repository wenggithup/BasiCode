package club.banyuan.Demo10.FuncitonInterface;

import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        String [] str={"古力娜扎，女","玛尔扎哈，男","迪丽热巴，女"};
        show(str,(t)->{
            System.out.print("姓名"+t.split("，")[0]);
        },(t)->{
            System.out.println("，性别"+t.split("，")[1]);
        });
    }

    private static void show(String[] str, Consumer<String> con1,Consumer<String> con2) {
        for (String s : str) {
            con1.andThen(con2).accept(s);
        }


    }
}
