package club.banyuan.Demo09.IO;

import java.io.*;

public class bufferedStream {
    public static void main(String[] args) throws IOException {
        /*BufferedOutputStream bs=new BufferedOutputStream(new FileOutputStream(new File("a.txt")));
        bs.write("你好啊你好小妹饿咩".getBytes());
        bs.flush();*/
        BufferedInputStream bi=new BufferedInputStream(new FileInputStream("1.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/club/banyuan/Demo08/IO/2.jpg"));
        int len=0;
        while ((len=bi.read())!=-1){
            bos.write(len);
        }
        System.out.println("复制完成");

    }
}
