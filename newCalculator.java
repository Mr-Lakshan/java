import java.util.Scanner;

public class newCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator you can calculate the values here");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the  operator ");

        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("The addition of numbers is " + (num1 + num2));
                break;
            case '*':
                System.out.println("The Multiplication of numbers is " + (num1 * num2));
                break;
            case '/':
                System.out.println("The division of numbers is " + (num1 / num2));
                break;
            case '-':
                System.out.println("The subtraction of numbers is " + (num1 - num2));
                break;

            case '%':
                System.out.println("The Modulas of numbers is " + (num1 % num2));
                break;
            default:
                System.out.println("please enter the valid exprassion or valid numbers");
                break;
        }

    }
}
