package club.banyuan.Demo07.Thread;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开启了线程");
    }
}
