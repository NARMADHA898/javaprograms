package hema;
import java.util.Scanner;
public class Rj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");

        double num1 = scanner.nextDouble();
        System.out.print("Enter the second value : ");

        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");

        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {

            case '+':

                result = num1 + num2;

                System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, result);

                break;

            case '-':

                result = num1 - num2;

                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);

                break;

            case '*':

                result = num1 * num2;

                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);

                break;

            case '/':

                if (num2 != 0) {

                    result = num1 / num2;

                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);

                } else {

                    System.out.println("Error: Division by zero is not allowed.");

                }

                break;

            default:

                System.out.println("Error: Invalid operator.");

                break;

        }
        scanner.close();

    }

}

