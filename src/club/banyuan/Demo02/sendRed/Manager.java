package club.banyuan.Demo02.sendRed;

import java.util.ArrayList;

public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    //定义发红包方法
    public ArrayList<Integer> send(int totalMoney,int count){
        //新建集合用于存储红包
        ArrayList<Integer> redlist=new ArrayList<>();

        //查看余额是否充足
        int leftmony=super.getMoney()-totalMoney;
        if(leftmony<0){
            System.out.println("余额不足");
        }else {
            //将红包等份划分
            int redMoney=totalMoney/count;
            //如果除不尽，将余数给最后一个元素上，并塞入集合
            int leftRedMoney=totalMoney%count;
            for (int i = 0; i < count-1; i++) {
                redlist.add(redMoney);
            }
            int lastMoney=leftRedMoney+redMoney;
            redlist.add(lastMoney);

            //当前余额应该重新设置
            super.setMoney(leftmony);
            return redlist;
        }

        return redlist;

    }
}
