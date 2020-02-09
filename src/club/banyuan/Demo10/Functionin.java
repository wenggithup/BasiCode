package club.banyuan.Demo10;

import club.banyuan.Demo03.MyInterface;

public class Functionin {
    public static void main(String[] args) {
        String s1="Hellow";
        String s2="word";
        String s3="Java";

        show(1,()-> s1+s2+s3);
    }

    private static void show(int level, MyInerface myInterface) {
        if(level==1){
            System.out.println(myInterface.method());
        }

    }
}
