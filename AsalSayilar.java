

public class AsalSayilar {
    public static void main(String[] args) {


        for (int i = 2; i < 100; i++) {
            boolean deger = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    deger =false;
                    break;

                }

            }

            if(deger){
                System.out.print(i+" ");
            }
        }
    }
}
