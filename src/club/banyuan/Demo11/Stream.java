package club.banyuan.Demo11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stream {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("1", "吃饭");
        map.put("2", "睡觉");
        map.put("3", "拉屎");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);

    }
}
