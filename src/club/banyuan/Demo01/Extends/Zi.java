package club.banyuan.Demo01.Extends;

public class Zi extends Fu {
    String th;

    public Zi() {
        System.out.println("这是子类的无参构造");
    }

    public Zi(String th) {
        System.out.println("这是子类的有参构造");
    }


    public void tmethod(){
        System.out.println("这是子类的方法");
    }
}
