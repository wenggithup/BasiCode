package club.banyuan.Demo01.Extends;

public class Fu extends Ye {
    String str;

    public Fu(String str) {
        System.out.println("父类有参构造");
    }

    public Fu() {
        System.out.println("父类无惨构造");
    }

    public void method(){
        System.out.println("这是弗雷的方法");
    }
}
