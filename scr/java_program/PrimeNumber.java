import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.println("prime number up to " + n + " : ");
        for (int i = 2; i <= n; i++) {
            boolean isprime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }

            }
            if (isprime) {
                System.out.println(i + " ");
            }
        }
        input.close();
    }
}
