package club.banyuan.Demo10.FuncitonInterface;

import java.util.function.Supplier;

public class supplier {

    public static void main(String[] args) {
        int [] arr={55,66,22,-22,100};
        int m=  show(()->{
            int max=arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>max){
                    max=arr[i];
                }

            }
            return max;
        });

        System.out.println(m);
    }

    private static int show(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
