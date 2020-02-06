package club.banyuan.Demo07.Thread;

public class baozipu extends Thread {
    private baozi bz;


    public baozipu(baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            synchronized (bz) {
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    if (i % 2 == 0) {
                        bz.pi = "豹皮";
                        bz.xian = "马肉";
                    } else {
                        bz.pi = "厚皮";
                        bz.xian = "牛肉";
                    }
                    System.out.println("正在卖" + bz.pi + "皮的" + bz.xian + "馅的包子");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    bz.flag = true;
                    bz.notify();
                }
            }
        }





    }
}
