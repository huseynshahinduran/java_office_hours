public class Method01 {
    public static void main(String[] args) {
    /*
     * Kullanıcıda bir String kümesi girmesini isteyelim ve Kaç kelimeden
     * oluştuğunu dönen java methodu yazınız.
     */

    Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz:");
    String str=scan.nextLine();

		System.out.println("Metindeki kelime sayisi: "+kelimeSayisi(str));
	scan.close();
}

    public static int kelimeSayisi(String str) {

        int count=0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==' ') {
                count++;
            }
        }

        count=count+1;
        return count;
    }
}
