package HarmonikOrtalama;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3};

        double harmonikSeri = 0.0;


        for(int i = 0;i < numbers.length ;i++ ){

            harmonikSeri = harmonikSeri + (1.0 / numbers[i]);

        }

        double harmonikOrtalama = numbers.length / harmonikSeri;

        System.out.println(harmonikOrtalama);

    }
}
