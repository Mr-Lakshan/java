package oops;

public class Modifier {
    public  static  String name = "Rahul";

    private static int age = 90;

    public Modifier(String Name, int Age){

        this.name = Name;
        this.age = Age;
    }
    public static void main(String[] args) {

        Modifier objModifier = new Modifier(name, age);

    System.out.println(objModifier.name + objModifier.age);

    InnerModifier objInner = new InnerModifier("Lawyer", 50);


        
   
    }
    
}

 class InnerModifier {


    
    private String Teaname = "Lipton";

     InnerModifier(String profession, int salary){

        String proFession = profession;
        int Salary = salary;
        System.out.println( "He is a " + proFession+ "and he earns "+Salary + "Takes tea " +Teaname + Modifier.name);
    }
}