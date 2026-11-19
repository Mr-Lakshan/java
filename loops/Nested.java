package loops;

public class Nested {
    public static void main(String[] args){
        for (int i = 1; i<5; i++){
            System.out.println("");

            for (int a =5; a>=0; a--){
                System.out.print("*");
            }
        }
    }
}
