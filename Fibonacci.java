import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {

        int k,l=1,toplam=0;

        Scanner giris = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz :");
        int a = giris.nextInt();

        for(int i=0;i < a;i++){

           System.out.print(toplam+ " ");

            k=l;
            l=toplam;
            toplam= k + l;




        }
    }
}
