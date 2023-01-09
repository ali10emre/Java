import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km, yas, yTipi;
        double mesafe = 0.10, tutar = 0,yIndirimi,gdIndirimi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön, 2=> Gidiş Dönüş): ");
        yTipi = inp.nextInt();

        tutar = km * mesafe;

        if ((km > 0 && yas > 0) && (yTipi>0 && yTipi<3)){

                if(yas < 12){
                    yIndirimi = tutar * 0.50;
                    tutar = tutar - yIndirimi;
                }
                else if(yas >= 12 && yas < 24){

                    yIndirimi = tutar * 0.10;
                    tutar = tutar - yIndirimi;

                }
               else if(yas > 65) {
                    yIndirimi = tutar * 0.30;
                    tutar = tutar - yIndirimi;
                }

                if(yTipi == 2){

                    gdIndirimi = tutar * 0.20;
                    tutar = (tutar - gdIndirimi) * 2;
                    System.out.println("Toplam Tutar = " + tutar + " TL");

                }
                else if(yTipi == 1){
                    System.out.println("Toplam Tutar = " + tutar + " TL");
                }


        }
        else{
            System.out.println("\n\nHatalı Veri Girdiniz !");
        }





    }

}
