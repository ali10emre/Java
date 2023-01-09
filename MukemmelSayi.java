import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int k=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();

        for(int i=1; i<n ; i++){

            if(n % i == 0){

                k+=i;

            }

        }

        if(k == n){
            System.out.println(n + " Mükemmel sayıdır.");
        }

        else
        {
            System.out.println(n + " Mükemmel sayı değildir.");
        }



    }
}
