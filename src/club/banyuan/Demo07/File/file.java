package club.banyuan.Demo07.File;

import java.io.File;
import java.io.IOException;

public class file {
    public static void main(String[] args) {

        /*File file=new File("c.txt");
        System.out.println(file.getAbsoluteFile());
        if(file.exists()){
            System.out.println("文件存在");
        }else {
            try {
                file.createNewFile();
                System.out.println("文件不存在");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file1=new File("/Users/edz/IdeaProjects/BasicProject");
        String[] list = file1.list();
        for (String filename : list) {
            System.out.println(filename);
        }*/

        File file=new File("/Users/edz/IdeaProjects/BasicProject");
        show01(file);

    }

    private static void show01(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                show01(f);
            }else {
                String s = f.toString();
                if (s.contains("Main")) {
                    System.out.println(s);
                }

            }
        }

    }

    private static void show() {
        File file=new File("/Users/edz/IdeaProjects/BasicProject");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }

    }


}
