package club.banyuan.Demo09.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class transform {

    public static void main(String[] args) throws IOException {
        showUtf();
    }

    private static void showUtf() throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("src/club/banyuan/Demo09/IO/c.txt"),"utf-8");
        osw.write("你好啊");
        osw.flush();

    }
}
