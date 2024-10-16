import java.util.Random;

public class NumberRandom {

    public static void main(String[] args) {

        Random random = new Random();

        // int x = random.nextInt(6) + 1; // (6) it will generate numbers below 6. (6)+1
        // it will generate numbers including 6.

        // double y = random.nextDouble();

        boolean z = random.nextBoolean();

        System.out.println(z);

    }
}
