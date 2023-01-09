import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz :");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuz :");
        muzik = inp.nextInt();

        double avarage = (mat+fizik+kimya+turkce+muzik) / 5;


        if(avarage <= 55){

            System.out.println("Sınıfta kaldınız !!!");
        }
        else{
            System.out.println("Sınıfı geçtiniz. Tebrikler!!!");
        }

        System.out.println("Ortalamanız : " + avarage);


    }
}
