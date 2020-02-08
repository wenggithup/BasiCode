package club.banyuan.Demo09.IO;

import java.io.*;
import java.util.HashMap;

public class copy {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map=new HashMap();
        BufferedReader br=new BufferedReader(new FileReader("src/club/banyuan/Demo09/IO/a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/club/banyuan/Demo09/IO/b.txt"));
        String line=null;
        while ((line=br.readLine())!=null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        for(String key:map.keySet()){
            String value=map.get(key);
            String str=key+"."+value;
            bw.write(str);
            bw.newLine();
            bw.flush();
        }

    }
}
