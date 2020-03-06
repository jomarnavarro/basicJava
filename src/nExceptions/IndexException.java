package nExceptions;

public class IndexException {

    public static void main(String[] args) {
        int[] a = {5, 10};
        int b, result;
        b = 5;

        try {
            result = a[2] / b - a[1];
        } catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch(ArrayIndexOutOfBoundsException ai) {
            System.out.println(ai.getMessage());
        }

        result = a[1] / a[0];
        System.out.println("Result: "  + result);
    }
}
