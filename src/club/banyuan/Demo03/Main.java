package club.banyuan.Demo03;

public class Main {

    public static void main(String[] args) {
        Fu obj = new ZI();
        System.out.println(obj.num);//20
        obj.method();//子类的方法
        obj.methodFu();//父类的方法
        //不能使用obj.methodZi();
        int num=(int)(10.5);
        System.out.println(num);
    }
}
