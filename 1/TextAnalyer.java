import java.util.Scanner;

public class TextAnalyer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";
        System.out.println("Enter  text(type 'STOP' to finish:) : ");
        while (true) {
            String line = input.nextLine();
            if (line.equalsIgnoreCase("STOP"))
                break;
            text += line + "\n";
        }
        input.close();
        System.out.println("Characters : " + text.length());
        System.out.println("words : " + text.trim().split("\\s+").length);
        System.out.println("Lines :" + text.split("\n").length);
    }
}