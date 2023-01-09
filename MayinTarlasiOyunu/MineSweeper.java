package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int row, col, success = 0;
        prepareGame();
        System.out.println("Oyun Başladı !");
        while (game) {                // Mayına denk gelene kadar oyun true olacağı için devam edicek.
            print(board);
            System.out.print("Satır :");
            row = scan.nextInt();
            System.out.print("Sütun :");
            col = scan.nextInt();

            if (row < 0 || row >= rowNumber) {
                System.out.println("Geçersiz koordinat girdiniz !!!");
                continue;
            }
            if (col < 0 || col >= colNumber) {
                System.out.println("Geçersiz koordinat girdiniz !!!");
                continue;
            }

            if (map[row][col] != -1) {         //Mayını seçmediğimiz zaman oyun devam edicek.
                check(row, col);
                success++;                     // Oyunu bitirmek için bir değişken tanımladım.
                if (success == (size - (size / 4))) {
                    System.out.println("Oyunu kazandınız !!! Mayınlara basmadınız Tebriklerrr !!!");
                    print(map);
                    break;
                }
            } else {
                game = false;
                System.out.println("Game Over !");
                print(map);
            }
        }
    }

    public void check(int r, int c) {
        if (map[r][c] == 0) {                                                                           //burada ekstra sorgular yapmamız gerekti çünkü ilk satır, son satır ,ilk sütun ve son sütunlarda yukarısı,aşağısı,sol veya sağ taraflarında karakter olmadığı için hata vermemesi adına bu sorguları yapmam gerekti.
            if ((c < colNumber - 1) && (map[r][c + 1] == -1)) {                                         // seçilen konumun sağ tarafında mayın var mı diye baktık.
                board[r][c]++;
            }
            if ((r < rowNumber - 1) && (map[r + 1][c] == -1)) {                                         // seçilen konumun alt tarafında mayın var mı diye baktık.
                board[r][c]++;
            }
            if ((r > 0) && (map[r - 1][c] == -1)) {                                                     // seçilen konumun üst tarafında mayın var mı diye baktık.
                board[r][c]++;
            }
            if ((c > 0) && (map[r][c - 1] == -1)) {                                                     // seçilen konumun sol tarafında mayın var mı diye baktık.
                board[r][c]++;
            }
            if ((r > 0) && (c < colNumber - 1) && (map[r - 1][c + 1] == -1)) {                          // seçilen konumun sağ üst çaprazında mayın var mı diye baktık.
                board[r][c]++;
            }
            if ((c < colNumber - 1) && (r < rowNumber - 1) && (map[r + 1][c + 1] == -1)) {              // seçilen konumun sağ alt çaprazında mayın var mı diye baktık.
                board[r][c]++;
            }
            if ((c > 0) && (r > 0) && (map[r - 1][c - 1] == -1)) {                                      // seçilen konumun sol üst çaprazında mayın var mı diye baktık.
                board[r][c]++;
            }
            if ((r < rowNumber - 1) && (c > 0) && (map[r + 1][c - 1] == -1)) {                          // seçilen konumun sol alt çaprazında mayın var mı diye baktık.
                board[r][c]++;
            }


            if (board[r][c] == 0) {                                                                      // seçilen konumun etrafında hiç mayın yoksa -2 yazdırıyoruz.
                board[r][c] = -2;
            }

        }
    }

    public void prepareGame() {
        int randRow, randCol, count = 0;        // randRow ve randCol adında iki tane rastgele sayı üreticez.
        while (count != (size / 4)) {           // burada for ile değil de while ile yapmamızın amacı for döngüsü kullansak, örneğin size ımız 8/4 ten 2 iken aynı yere gelen mayınlar olduğu zaman sadece 1 mayın üretilecekti burada while kullanarak istediğimiz sayı kadar mayın üretme imkanı sağladık.
            randRow = rand.nextInt(rowNumber);  // burada satır sayısını rastgele ürettik.
            randCol = rand.nextInt(colNumber);  // burada sütun sayısını rastgele ürettik ve böylece mayının yerini üretmiş olduk.

            if (map[randRow][randCol] != -1) {  //burada öncelikle -1 olarak mayınlarımızı tutacağımızı belirledik ve if ile aynı yere 2 tane mayın koymamak için sorgumuzu gerçekleştirdik.
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 0) {            //buradaki amacımız eğer karakter 0 ise ,diğer karakterler -1 gibi 2 karakterli olacağı için düzgün bir görüntü elde etmek için 0 dan önce bir boşluk karakteri daha ekleyerek bu durumu düzeltiyoruz.
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

