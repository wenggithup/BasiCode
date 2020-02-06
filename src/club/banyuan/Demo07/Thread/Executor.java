package club.banyuan.Demo07.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(10);
        es.submit(new MyRunable());
        es.submit(new MyRunable());


    }
}
