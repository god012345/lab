import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int l = 1;
        int u = 15;
        int randomnumber = random.nextInt(u - l + 1) + l;
        System.out.println("Generated random : " + randomnumber);
        if (randomnumber <= 5) {
            System.out.println("the number is in the 'low' range (1-5)");
        } else if (randomnumber <= 10) {
            System.out.println("the number is in the 'medium' range (6-10)");
        } else {
            System.out.println("the number is in the 'high' range (11-15)");
        }
    }
}
