package club.banyuan.Demo02.sendRed;

import java.util.ArrayList;

public class Person extends User {

    public Person(String name, int money) {
        super(name, money);
    }

    public  Person(){
    }

    //设置收红包的方法

    public void recieve(ArrayList<Integer> redList){
        //1、随机收到红包，2、收到之后余额增加

        //查看当前的余额
        int money=super.getMoney();
        //从集合中随机取一个红包
        int index=(int)(Math.random()*(redList.size()));
        //将该元素移除，并得到对应元素
        Integer delta= redList.remove(index);
        //将该元素与之前的余额想加，重新设置余额
        super.setMoney(money+delta);
    }
}
