package methods;
import java.util.Scanner;
public class method {
    static void myFirstMethod(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name");

        String name = scanner.next();

        System.out.println("Enter the age ");

        int age = scanner.nextInt();

        myFirstMethod();
        methodParameter(name, age);


    }
     
    static void methodParameter(String name, int age){
        System.out.println("The name is "+name + " and age is "+age);
    }

}
