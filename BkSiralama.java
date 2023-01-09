import java.util.Scanner;

public class BkSiralama {
    public static void main(String[] args) {

        int toplamSayi,n;
        int max=0,min=0;



        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç sayı giriceksiniz: ");
        toplamSayi = inp.nextInt();


        for(int i =1; i <= toplamSayi; i++){
            System.out.print(i+". Sayıyı giriniz: ");
            n = inp.nextInt();

            if (i == 1 ){
                max = n;
                min = n;
            }
            else{
                if(n >= max){
                    max = n;
                }

                else if(n < min){
                    min = n;
                }

            }

        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);




    }
}
