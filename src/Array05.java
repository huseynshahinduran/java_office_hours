public class Array05 {
    public static void main(String[] args) {

        /*
        Bir int array icerisinde tekrarlanan elemani bulan java kodunu yazalim.
         */

        int[] arr={1,2,3,4,5,6};
        int flag=0;

        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]==arr[j]) && (i!=j)){
                    System.out.println("Tekrarlanan eleman: "+arr[j]);
                    flag++;
                }
            }
        }
        if(flag==0){
            System.out.println("Tekrarlanan eleman yok!");
        }

    }
}
