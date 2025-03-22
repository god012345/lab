import java.util.Scanner;

class employee {
    int id;
    String name;
    float sal;
    Scanner s = new Scanner(System.in);

    public void setemp() {
        System.out.print("Enter id : ");
        id = s.nextInt();
        System.out.print("Enter your name : ");
        name = s.next();
        System.out.print("Enter your salary : ");
        sal = s.nextFloat();
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + sal);
    }

}

public class emp {
    public static void main(String[] args) {
        employee e = new employee();
        e.setemp();
        e.display();
    }

}
