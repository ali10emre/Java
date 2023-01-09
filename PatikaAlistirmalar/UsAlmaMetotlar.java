package Metotlar;

import java.util.Scanner;


public class UsAlmaMetotlar {

    static int exponentiation(int n,int k){

        if (k==0){
            return 1;
        }

        return n * exponentiation(n,k-1);

    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz :");
        int number = inp.nextInt();
        System.out.print("Üs değerini giriniz :");
        int base = inp.nextInt();

        System.out.println("Sonuc :" + exponentiation(number,base));

    }
}
