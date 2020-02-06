package club.banyuan.Demo05;

import java.util.*;

public class Main {

    public static void main(String[] args) {
     /*   int i=0;
        System.out.println(i++);
        for (int j = 0; j <5 ; ++j) {
            System.out.println(j);

        }
        Collection <String> con=new ArrayList<>();
        con.add("张三");
        Iterator<String> it= con.iterator();
        while (it.hasNext()){
            String  s=it.next();
            System.out.println(s);
        }*/

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一行字符，按回车结束");
        String str=sc.nextLine();
        //用map存储出现的字符和次数，键存储字符，值存储出现的次数
        Map <Character,Integer> map=new HashMap<>();
        char [] cha= str.toCharArray();
        for (char c : cha) {
            //判断键值是否包含某个值
            if(map.containsKey(c)){
                //通过键得到值
                Integer integer=map.get(c);
                map.put(c,integer+1);
            }else {
                map.put(c,1);
            }
        }
        //遍历主键集合
        for (Character c : map.keySet()) {
            Integer value=map.get(c);
            System.out.println(c+"="+value);
        }

    }
}
