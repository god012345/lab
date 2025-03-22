import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string :");
        String firstString = input.nextLine();
        System.out.print("Enter the secound string :");
        String secondString = input.nextLine();
        System.out.print("Enter the substring to search : ");
        String tosearch = input.nextLine();
        if (firstString.contains(tosearch)) {
            System.out.println("the string \"" + tosearch + "\" is found in the first string");
        } else {
            System.out.println("the string \"" + tosearch + "\" not found in the first string ");
        }
        String concat = firstString.concat(secondString);
        System.out.println("concatenated string  : " + concat);
        input.close();

    }
}
