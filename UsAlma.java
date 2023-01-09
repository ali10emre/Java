import java.util.Scanner;


public class UsAlma {
    public static void main(String[] args) {

        int n,k,i,total=1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayıyı Giriniz :");
        n = inp.nextInt();

        System.out.print("Üs Olacak Sayıyı Giriniz :");
        k = inp.nextInt();

        for(i=1; i<=k ;i++ ){

            total *= n;

        }

        System.out.println("Cevap : " + total);
    }
}
