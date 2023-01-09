package Metotlar;

import java.util.Scanner;

public class AsalSayiMetotlar {

    static boolean prime(int number,int i){

        if(i == number ){

            return true;
        }

        else if(number % i ==0){

            return false;
        }
            return prime(number,i+1);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number = scan.nextInt();
        int i =2;

        System.out.print(prime(number,i) ? number + " sayısı ASALDIR !" : number + " sayısı ASAL değildir !" );

    }
}
