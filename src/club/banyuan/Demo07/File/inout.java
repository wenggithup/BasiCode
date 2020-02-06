package club.banyuan.Demo07.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class inout {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("a.txt");
        FileOutputStream ots=new FileOutputStream("c.txt");
        System.out.println(fis.available());
        byte [] by=new byte[1024];
        //返回有效读取字节数，如果字节数组比目标文件大，目标文件字节大小，否则返回数组大小，此时需要通过循环写入；

        int i= fis.read(by);
        System.out.println(i);
        ots.write(by);
        /*int length=0;
        while((length=fis.read(by))!=-1){
            System.out.println(length);
            ots.write(by,0,length);
        }*/



    }
}
