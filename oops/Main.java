package oops;

public class Main {

    int y = 14;

    public static void main(String[] args) {

        Basic obj1 = new Basic();

        System.out.println(obj1.x);
        int x = 178;
        System.out.println(obj1.x);

        Testone obj2 = new Testone();

        obj2.hello(x);
    }

}
