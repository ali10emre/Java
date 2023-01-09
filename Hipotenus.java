import java.util.Scanner;


public class Hipotenus {
    public static void main(String[] args) {

        double a,b,c;

        Scanner veri = new Scanner(System.in);

        System.out.print("Üçgenin bir kısa kenarını giriniz = ");
        a = veri.nextDouble();

        System.out.print("Üçgenin diğer kısa kenarını giriniz = ");
        b = veri.nextDouble();

        a*=a;
        b*=b;
        c=Math.sqrt(a+b);
        System.out.println("Hipotenüs'ün uzunluğu = "+ c);
    }
}
