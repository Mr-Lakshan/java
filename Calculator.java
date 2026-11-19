import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter first number");
        // int num1 = scanner.nextInt();/*  */
        // System.out.println("The first number is "+ num1);

        // System.out.println("Enter second number");
        // int num2 = scanner.nextInt();
        
        // System.out.println("The Second number is "+ num2);

        // char operator = scanner.next().charAt(0);

        // int result = 0;

        
        // System.out.println("The addition of both numbers is  "+ (num1+num2));

        // for boolean

        boolean taste = true;

        System.out.println(taste);
    // type casting
        
        int number = 8;

        double mynum = number;
        System.out.println(number);
        System.out.println(mynum);

        String name = "Rahul";
        String city = "Delhi";
        String word = "A";
        // String name = "anuj";
        String Rahul = "Rahul is a\r good \"person\\\"";
        System.out.println(Rahul);

        StringBuilder str = new StringBuilder("Hi how are you");

        str.append('?');

        
        str.insert(7, mynum);
        System.out.println(str);

        System.out.println("please enter the first number");
        int numbers = scanner.nextInt();
        System.out.println("please enter the second number");

        int numbers1 = scanner.nextInt();
        var result = Math.max(numbers, numbers1);

        System.out.println("the max number is "+result);
    }
   
}
