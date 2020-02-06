package club.banyuan.Demo07.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt", true);
        for (int i = 0; i < 5; i++) {
            fos.write("你好".getBytes());
            fos.write("\n".getBytes());
        }

    }
}
