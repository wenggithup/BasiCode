package club.banyuan.Demo07.File;

public class digui {

    public static void main(String[] args) {
        int i = show(2, 5);
        System.out.println(i);

        int sum = show02(10);
        System.out.println(sum);

        int di = show03(5);
        System.out.println(di);
    }

    private static int show03(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * show03(i - 1);
        }

    }

    private static int show02(int i) {
        if (i == 1) {
            return i;
        } else {
            return i + show02(i - 1);
        }

    }

    private static int show(int a, int b) {
        int sum = 0;
        while (a <= b) {
            sum += a;
            a++;
            show(a, b);
        }
        return sum;

    }
}
