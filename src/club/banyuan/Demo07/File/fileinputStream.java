package club.banyuan.Demo07.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileinputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        int count=0;
        while (fis.read()!=-1){
            count++;
        }
        System.out.println(count);
        byte []by=new byte[count];
        fis.read(by);
        System.out.println(new String(by));
        /*byte [] by=new byte[1024];
        int length=0;
        while((length=fis.read(by))!=-1){
            System.out.println(new String(by,0,length));
            System.out.println(length);
        }*/

    }
}
