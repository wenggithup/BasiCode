package club.banyuan.Demo09.IO;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.HashMap;

public class main {

    public static void main(String[] args) {
        String s="1";
        String s2="2";
        String s3="3";
        String s4="4";
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        HashMap<String, String> hashMap=new HashMap();
        hashMap.put(s,"我是");
        hashMap.put(s2,"牛逼");
        hashMap.put(s4,"chaoji");
        hashMap.put(s3,"dsdas");
        for (String key:hashMap.keySet()){
            String value=hashMap.get(key);
            System.out.println(key+"="+value);
        }


    }
}
