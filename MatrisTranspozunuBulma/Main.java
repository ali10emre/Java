package MatrisTranspozunuBulma;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Matrisin boyutlarını giriniz");
        System.out.print("Matrisin satır sayısı :");
        int row =inp.nextInt();
        System.out.print("Matrisin sütun sayısı :");
        int col =inp.nextInt();

        int[][] list = new int[row][col];

        System.out.println("Matrisin elemanlarını giriniz :");
        for(int i = 0; i < list.length;i++){
            for(int j=0;j < list[i].length;j++){
                list[i][j]=inp.nextInt();
            }
        }
        int[][] list2 = new int[col][row];

        for(int i = 0; i < list2.length;i++){
            for(int j=0;j < list2[i].length;j++){
                list2[i][j] = list[j][i];
            }
        }

        System.out.println("Matris :");
        for(int i = 0; i < list.length;i++){
            for(int j=0;j < list[i].length;j++){
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze :");
        for(int i = 0; i < list2.length;i++){
            for(int j=0;j < list2[i].length;j++){
                System.out.print(list2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
