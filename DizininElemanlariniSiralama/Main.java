package DizininElemanlariniSiralama;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int boy = scan.nextInt();

        int[] list = new int[boy];
        System.out.println("Dizinin elemanlarını giriniz : ");

        for(int i = 0;i < list.length;i++){

            System.out.print((i+1)+". Elamanı : ");
            list[i]=scan.nextInt();


        }

        Arrays.sort(list);
        System.out.print("Sıralama : " );

        for(int i = 0;i <list.length;i++ ){
            System.out.print(list[i] + " ");

        }



    }
}
