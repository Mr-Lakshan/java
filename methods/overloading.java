package methods;

import java.util.Scanner;
public class overloading {
    static int methodOne(int x, int y){

       int z = x+y;

       return z;
    }
    static double methodOne(double x, double y){
        double a = x+y;

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();

         System.out.println("Enter the second number ");
         int num2 = scanner.nextInt();

         double num3 = num1;
         double num4 = num2;
        System.out.println("The adding with integer is "+ methodOne(num1, num2));
        
        System.out.println("The addition with double is "+methodOne(num3, num4));
    }
}
