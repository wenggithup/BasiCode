package club.banyuan.Demo03;

public interface MyInterface {

    //定义常量
    public static final int NUM=20;

    //定义抽象方法
    public abstract void getInterface();

    //定义默认方法

    public default void setInterface(){
        System.out.println("这是接口中的默认方法");
    }

    //静态方法
    public static void methodA(){
        System.out.println("这是静态方法");
    }

}
