import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args) {

        double boy, kilo, index;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz(m) : ");

        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz(kg) : ");

        kilo = inp.nextDouble();

        index = kilo / (boy * boy) ;

        System.out.println("Vücut kitle indeksiniz : " + index );

    }
}
