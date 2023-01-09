import java.util.Scanner;


public class EbobEkok {
    public static void main(String[] args) {

        int i =1,ebob =1,ekok,k=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz :");
        int n1 = inp.nextInt();

        System.out.print("n2 sayısını giriniz :");
        int n2 = inp.nextInt();

        if(n1 < n2){
            while(i <= n1){

                if(n1 % i == 0 && n2 % i == 0){

                    ebob=i;

                }



                i++;
            }
            System.out.println("ebob :" + ebob);
        }
        else{
            while(i <= n2){

                if(n1 % i == 0 && n2 % i == 0){

                    ebob=i;

                }


                i++;
            }
            System.out.println("ebob :" + ebob);
        }

        while (k <= (n1 * n2)){

            if(k % n1 == 0 && k % n2 == 0){

                ekok=k;
                System.out.println("ekok :" + ekok);
                break;
            }


            k++;
        }

    }
}
