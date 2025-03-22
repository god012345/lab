public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int a = 10, b = 2;
            int result = a / b;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught : division by zero is not allowed ");
        } finally {
            System.out.println("Exception completed");
        }
    }
}
