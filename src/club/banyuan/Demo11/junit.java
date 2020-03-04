package club.banyuan.Demo11;

import org.junit.Assert;
import org.junit.Test;

public class junit {
    @Test
    public   void show() {
        int result= add(1,6);
        Assert.assertEquals(7,result);
    }

    private static int add(int a,int c) {
        return a-c;
    }
}
