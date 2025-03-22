import java.util.Scanner;
import Package.*;

public class calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = input.nextInt();
        int b = input.nextInt();
        addition obj = new addition();
        int c = obj.add(a, b);
        System.out.println("Addition : " + c);
        input.close();

    }
}
