package ArrayOfObject;

public class ArrayOfObject {

    public static void main(String[] args) {

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Pasta");

        Food[] refrigerator = { food1, food2, food3 };

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

        // Food[] refrigerator = new Food[3];

        // Food food1 = new Food("Pizza");
        // Food food2 = new Food("Burger");
        // Food food3 = new Food("Pasta");

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        // System.out.println(refrigerator[0].name);
        // System.out.println(refrigerator[1].name);
        // System.out.println(refrigerator[2].name);

    }
}
