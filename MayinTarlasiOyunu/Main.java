package MayinTarlasi;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        System.out.println("1-Oyunumuzda (0) default değerdir.\n2-Oynumuzda ilk satır 0 sayısı ile,ilk sütunda 0 sayısı ile koordinantlanmıştır.Örneğin 3 e 3 bir boyut girdiğinizde ilk satır 0, ilk sütun 0, son satır 2 ve son sütun 2 şeklinde tercihlerde bulunabilirsiniz. \n3-(0) dan farklı bir değer ile ifade edilen sayı o seçilen yerin etrafında bulunan mayın sayısını ifade eder.\n4-(-2) ile ifade edilen değer seçilen yerin etrafında hiçbir mayın bulunmadığını kanıtlar.\n5-Son olarak (-1) ile ifade edilen değer mayını gösterir.\n");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz !");
        System.out.print("Satır Sayısı : ");
        int row = scan.nextInt();
        System.out.print("Sütun Sayısı : ");
        int col = scan.nextInt();


        MineSweeper m = new MineSweeper(row, col);
        m.run();


    }


}




