import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        double para,kdv=0.18,kdvPara,toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Para degerini giriniz :");
        para=inp.nextDouble();

        kdvPara=para*kdv;
        toplam=kdvPara+para;


        System.out.println("KDV'siz Fiyat = " + para);
        System.out.println("KDV'li Fiyat = " + toplam);
        System.out.println("KDV tutarı = " + kdvPara);


    }
}
