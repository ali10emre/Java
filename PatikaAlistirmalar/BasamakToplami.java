import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        int i,n,counter=0,basamakSayisi,toplam=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        n = inp.nextInt();

        while(n != 0){
            counter++;
            basamakSayisi = n % 10;
            toplam += basamakSayisi;
            n/=10;

        }
        System.out.println("Girilen Sayının Basamak Sayısı :" + counter);
        System.out.println("Girilen Sayının Basamak Sayıları Toplamı :" + toplam);
    }
}
