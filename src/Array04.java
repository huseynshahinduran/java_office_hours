import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        //Array listesinin ortalamasini bulan java kodunu bulalim

        int[] num={20,30,25,32,-15,111};
        int sum=0;
        double ort=0;

        for (int i=0; i<num.length; i++){
            sum=sum+num[i];
        }
        ort=sum/num.length;

        System.out.println("Sayilarin ortalamasi: "+ort);

    }

}
