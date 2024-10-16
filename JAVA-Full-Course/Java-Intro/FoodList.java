import java.util.ArrayList;

public class FoodList {
    
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();

        food.add("Chicken");
        food.add("Mutton");
        food.add("Pizza");
        food.add("Burger");

        food.set(0, "Sambar");
        food.remove(3);
        // food.clear();

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}

// it comes to array list we can measure by "size" not "length".

// ArrayList => a resizable array. 
//              elements can be added or removed after compilation phase
//              store reference data types