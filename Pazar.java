import java.util.Scanner;

public class Pazar {
    public static void main(String[] args) {

        int armut, elma, domates, muz, patlican;
        double kgArmut = 2.14, kgElma = 3.67, kgDomates = 1.11, kgMuz = 0.95, kgPatlican = 5.0, toplam;

        Scanner veri = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        armut = veri.nextInt();
        toplam= armut * kgArmut;

        System.out.print("Elma kaç kilo ? : ");
        elma = veri.nextInt();;
        toplam = toplam + (elma * kgElma);

        System.out.print("Domates kaç kilo ? : ");
        domates = veri.nextInt();
        toplam = toplam + (domates * kgDomates);

        System.out.print("Muz kaç kilo ? : ");
        muz = veri.nextInt();
        toplam = toplam + (muz * kgMuz);

        System.out.print("Patlıcan kaç kilo ? : ");
        patlican = veri.nextInt();
        toplam = toplam + (patlican * kgPatlican);

        System.out.println("Toplam Tutar : " + toplam);


    }
}
