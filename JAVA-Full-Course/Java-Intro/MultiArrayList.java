import java.util.ArrayList;

public class MultiArrayList  {
    
    
        public static void main(String[] args) {

            ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
            
            ArrayList<String> bakeryList = new ArrayList();
            bakeryList.add("pasta");
            bakeryList.add("samosa");
            bakeryList.add("garlic bread");
            bakeryList.add("veg roll");

            ArrayList<String> produceList = new ArrayList();
            produceList.add("tomatoes");
            produceList.add("onions");
            produceList.add("drumstick");

            ArrayList<String> drinksList = new ArrayList();
            drinksList.add("sprite");
            drinksList.add("coke");

            groceryList.add(bakeryList);
            groceryList.add(produceList);
            groceryList.add(drinksList);

            System.out.println(groceryList.get(2).get(1));
    }
}

// 2D arrayList => a dynamic list of lists\
// You can change the size of these lists during runtime