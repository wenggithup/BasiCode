package club.banyuan.Demo08.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereader {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("e.txt");

             FileReader fr = new FileReader("a.txt");) {
            int len = 0;
            while ((len = fr.read()) != -1) {
                fw.write((char) len);
            }
            fw.close();
            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
