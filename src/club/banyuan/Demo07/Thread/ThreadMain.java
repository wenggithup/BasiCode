package club.banyuan.Demo07.Thread;

public class ThreadMain {

    public static void main(String[] args) {
        baozi bz=new baozi();
        new baozipu(bz).start();
        new chihuo(bz).start();
    }
}
