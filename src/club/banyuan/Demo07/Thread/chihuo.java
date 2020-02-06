package club.banyuan.Demo07.Thread;

public class chihuo extends Thread {
    private baozi bz;

    public chihuo(baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (!bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("吃货正在吃" + bz.pi + "皮" + bz.xian + "馅的包子");
                    bz.flag = false;
                    bz.notify();
                    System.out.println("吃货已经把包子吃完了");
                    System.out.println("================================");
                }

            }
        }

    }
}
