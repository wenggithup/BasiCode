package club.banyuan.Demo03;

public class MainMyInterfance {

    public static void main(String[] args) {
        MyInterfaceImpl my=new MyInterfaceImpl();
        my.getInterface();//实现类中的接口
        my.setInterface();//默认的方法
        System.out.println(MyInterface.NUM);
        MyInterface.methodA();


    }
}
