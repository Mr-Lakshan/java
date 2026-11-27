package oops;

public class This {
    
    String x;

    public This(String x){
        this.x =x;
    }

    public static void main(String[] args) {
        This obj1 = new This("Akash Singh");

        System.out.println(obj1.x);
    }
}
