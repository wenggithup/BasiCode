package club.banyuan.Demo11;

public class main {
    public static void main(String[] args) {
        String str="/user/张三97/admin";
        String[] split = str.split("/");
        String s="";
        for (int i = 0; i < split.length; i++) {
            s+="/"+split[i];
        }
        System.out.println(s);
        String s1="";
        for (String s2 : split) {
            if(s2.length()>0){
                s1+="/"+s2;
            }
        }
        System.out.println(s1);
    }
}
