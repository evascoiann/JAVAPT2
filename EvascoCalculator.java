public class EvascoCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double result;

        result = num1 + num2;
        System.out.println("Addition: " + result);

        result = num1 - num2;
        System.out.println("Subraction: " + result);

        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        result = (double) num1 / num2;
        System.out.println("Division: " + result);
    }
}