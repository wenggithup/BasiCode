package club.banyuan.Demo10;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        String [] num=new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] puke = shuffle(num);
        opengame(puke);

    }

    private static void opengame(String[] puke) {
        String[] dizhu = new String[5];
        String[] nong1 = new String[4];
        String[] nong2 = new String[4];
        int di = 0;
        int no = 0;
        int no2 = 0;
        for (int i = 0; i < puke.length; i++) {
            if (i % 3 == 0) {
                dizhu[di] = puke[i];
                di++;
            } else if (i % 3 == 1) {
                nong1[no] = puke[i];
            } else {
                nong2[no2] = puke[i];
            }
        }
        String s1="地主手牌:";
        for (String s : dizhu) {
            s1+=s+" ";
        }
        System.out.println(s1);

    }




    private static String [] shuffle(String[] num) {
        String temp;
        for (int i = 0; i <num.length ; i++) {
        int len=new Random().nextInt(num.length);
        temp=num[i];
        num[i]=num[len];
        num[len]=temp;
        }
        return num;
    }
}
