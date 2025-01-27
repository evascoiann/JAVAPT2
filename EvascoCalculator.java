
import java.util.Scanner;

public class EvascoCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();
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