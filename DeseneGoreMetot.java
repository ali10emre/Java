package Metotlar;

import java.util.Scanner;


public class DeseneGoreMetot {

    static void desen(int number,int k,int n){

        if(number > 0 && n == 0){
            System.out.print(number + " ");
            number -=5;
            desen(number,k,0);
        }
        else if (number <= 0) {
            System.out.print(number + " ");
            number +=5;
            desen(number,k,1);
        }
        else if(number > 0 && number <= k && n == 1){
            System.out.print(number + " ");
            number  +=5;
            desen(number,k,1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı :");
        int n = input.nextInt();

        desen(n,n,0);

    }
}
