package MaxMin;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-778,2,0};

        System.out.print("Bir sayı giriniz :");
        int value = inp.nextInt();

        int[] newList = {15,12,788,1,-1,-778,2,0,value};
        Arrays.sort(newList);

        int min = newList[Arrays.binarySearch(newList,value) - 1];
        int max = newList[Arrays.binarySearch(newList,value) + 1];


        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen sayı : " + value );
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}
