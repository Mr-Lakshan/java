package oops;

public class Constructor {
    
int x;
String  fName;
int aGe;

public Constructor(String name, int age){
   fName = name;
   aGe = age;
}

public static void main(String[] args) {
    Constructor obj1 = new Constructor("Rahul", 55);

    System.out.println("Name of person is "+ obj1.fName + " and age is "+ obj1.aGe);
}


}
