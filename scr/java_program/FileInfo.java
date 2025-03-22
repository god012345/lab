import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name (with path):");
        String filename = input.nextLine();
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("File exist : YES");
            System.out.println("Readable : " + (file.canRead() ? "YES" : "NO"));
            System.out.println("Writable : " + (file.canWrite() ? "YES" : "NO"));
            System.out.println("File length : " + file.length() + " bytes");
        } else {
            System.out.println("File is not exist");
        }
        input.close();

    }

}
