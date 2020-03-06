package nExceptions;

public class DivideException {

    public static void main(String[] args) {
        int a, b, c, result;
        a = 12;
        b = c = 5;

        try {
            result = a / (b - c);
        } catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

        result = a / (b + c);
        System.out.println("Result: "  + result);
    }
}
