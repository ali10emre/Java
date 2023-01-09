import java.util.Scanner;


public class Kombinasyon {
    public static void main(String[] args) {

        int n,r,i,j,k;
        int nTotal = 1, rTotal = 1, nrTotal =1, total;

        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman Sayısı :");
        n = inp.nextInt();
        System.out.print("Seçim Sayısı :");
        r = inp.nextInt();
        k = n-r;

        if(k<0) {
            System.out.println("Yanlış değer girdiniz !!");
        }
        else {


            for (i = 1; i <= n; i++) {

                nTotal = nTotal * i;

            }

            for (i = 1; i <= r; i++) {

                rTotal = rTotal * i;

            }

            for (i = 1; i <= k; i++) {

                nrTotal = nrTotal * i;

            }

            total = nTotal / (rTotal * nrTotal);

            System.out.println(total);

        }

    }
}
