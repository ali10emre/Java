import java.util.Scanner;

public class TamBolunme {
    public static void main(String[] args) {

        int k,m = 0,l = 0,i=0;
        double t;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı giriniz :");
        k = inp.nextInt();

       while( i<=k ){
           if(i % 3 == 0 && i % 4 == 0 ){

               m = m + i;
               l++;
           }
           i++;
       }

       t = m / l;



        System.out.println(t);
    }
}
