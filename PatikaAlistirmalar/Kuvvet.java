import java.util.Scanner;

public class Kuvvet {
    public static void main(String[] args) {

        int n,i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır değerini giriniz :");
        n = scan.nextInt();

        System.out.println("4'ün kuvvetleri");
        for(i = 1; i <= n; i *= 4){

            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri");
        for(i = 1; i <= n; i *=5){

            System.out.println(i);

        }



    }
}
