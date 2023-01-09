import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("N Sayısını Giriniz :");
        int n = inp.nextInt();
        double sonuc = 0;

        for(int i=1; i <= n;i++){

            sonuc +=(1.0/i);
        }

        System.out.println(sonuc);


    }
}
