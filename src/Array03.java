import java.lang.reflect.Array;
import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        /*
        Array içerisindeki tek sayıları 1 artırıp çift sayıları 1 azaltan
        java methodu yazalım
         */

        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(donusum(a))); //[2, 1, 4, 3, 6, 5, 8, 7, 10]

    }

    public static int[] donusum(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                a[i] -= 1;
            } else {
                a[i] += 1;
            }
        }

        return a;
    }


}
