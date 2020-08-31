import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
         * Bir String array methodu olusturalim ve array elemanlarinin her birine
         * istedigimiz eki ekleyebilelim.
         * String[] arr={"clever", "meek", "hurried", "nice"}; "ly";
         */

        String[] arr={"clever", "meek", "hurried", "nice"};
        String ek="ly";
        System.out.println(arr);
        System.out.println(Arrays.toString(sonEk(arr,ek)));

    }

    public static String[] sonEk(String[]arr,String ek) {

        for (int i=0; i<arr.length; i++){
            arr[i]+=ek;
        }
        return arr;


    }


}
