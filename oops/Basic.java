package oops;

public class Basic {
    int x=10;

    public static void main(String[] args) {
        Basic obj1 = new Basic();

        System.out.println(obj1.x);

        Testone obj2 =  new Testone();
        obj2.hello(12);
    }
}

/**
 * Testone
 */
 class Testone {

    int z= 89;

    public  void hello(int z){
        System.out.println(z);
    }
    

}
