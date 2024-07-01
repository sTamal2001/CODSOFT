import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt((100 - 1) + 1) + 1;
        System.out.println("Random Number: " + randomNum);
    }
}
