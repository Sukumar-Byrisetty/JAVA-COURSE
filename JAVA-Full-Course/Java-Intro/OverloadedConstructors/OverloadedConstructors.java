package OverloadedConstructors;

public class OverloadedConstructors {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "topping");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }

}

// overloaded constructors => multiple constructors within a class with the same
// name,
// but have different parameters
// name + parameters = signature