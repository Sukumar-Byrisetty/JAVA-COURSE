import java.util.ArrayList;

public class ForEachLoop {
    
    public static void main(String[] args) {
        
        // String[] animals = {"lion", "tiger", "rabbit", "deer"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("lion");
        animals.add("tiger");
        animals.add("deer");
        animals.add("rabbit");

        for(String i : animals) {
            System.out.println(i);
        }

    }
}

// foreach => traversing technique to iterate through the elements in an array/collection
//            less steps, more readable
//            less flexible

// : => here colon means "IN". above we have animals in(:) string index