package DizidekiElemanlarinFrekansi;
import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value, int number) {
        for (int i = 0; i < number; i++) {

            if (value == arr[i]) {
                return true;
            }
        }
        return false;
    }

    static int repeated(int[] arr, int value) {

        int count = 0;

        for (int i : arr) {

            if (i == value) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[]args){

        int [] list={10,20,20,10,10,20,5,20};

        System.out.println("Dizi : "+ Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < list.length; i++) {

            if (!isFind(list, list[i], i)) {

                System.out.println(list[i] + " sayısı " + repeated(list, list[i]) + " kez tekrar edildi.");
            }
        }
    }
}