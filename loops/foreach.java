package loops;

public class foreach {
    public static void main(String[] args) {
        String [] cars = {"BMW","Mercediz","volskwagon","volvo"};

        for (String car : cars) {

            System.out.println(car);
            
        }

        int numbers [] ={78,28,18,69,96,18,14,26,78};

    int alength = numbers.length;

    int index=0;

    for (int i : numbers) {
        
        // System.out.println(numbers[index]);

        if(numbers[index]<i){
            numbers[index]=i;
        }
        // index++;


    }
    System.out.println(numbers[0]);
        for (int i : numbers) {
        
        // System.out.println(numbers[index]);

        if(numbers[index]>i){
            numbers[index]=i;
        }
        // index++;


    }
    System.out.println(numbers[0]);

    }
}
