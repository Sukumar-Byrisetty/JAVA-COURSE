package SuperKeyword;

public class SuperKeyword {

    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 45, "everything!");

        // System.out.println(hero1.toString());
        System.out.println(hero2.toString());

    }
}

// super keyword => keyword refers to the superclass (parent) of an object
//                  very similar to the "this" keyword