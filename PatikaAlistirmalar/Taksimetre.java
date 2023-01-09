import java.util.Scanner;


public class Taksimetre {
    public static void main(String[] args) {
        int km;

        double toplam, kmBasi = 2.20, tacilis = 10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz(km) : ");
        km = inp.nextInt();

        toplam = kmBasi * km;
        toplam += tacilis;
        toplam =(toplam <20) ? 20 : toplam;

        System.out.println("Toplam Ücret : " + toplam);

    }
}
