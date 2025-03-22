class BankAccount {
    public String name;
    public int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Name : " + name + " \nbalance : " + balance);
    }

    public void displayBalance() {
        System.out.println("Current balance : " + balance);
    }

}

class BankApp extends BankAccount {
    public BankApp(String name, int balance) {
        super(name, balance);
    }

    public void deposit(int add) {
        balance += add;
        System.out.println("deposit : " + add);
    }

    public void withdraw(int sub) {
        balance -= sub;
        System.out.println("withdraw : " + sub);
    }

}

public class Bank {
    public static void main(String[] args) {
        BankApp person1 = new BankApp("Gopinath", 20000);
        person1.display();
        person1.deposit(1000);
        person1.withdraw(500);
        person1.withdraw(1000);
        person1.displayBalance();
    }
}
