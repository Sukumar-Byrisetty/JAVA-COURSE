
public class Methods {

    public static void main(String[] args) {
        
        int x = 3;
        int y = 4;

        int z = add(x,y);

        System.out.println(z);
    }

    static int add(int x, int y) {
        
        int z = x + y;
        return z;
    }
}



/*
 * public class Methods {
 * 
 * public static void main(String[] args) {
 * 
 * String name = "Welcome";
 * int age = 24;
 * 
 * hello(name,age);
 * 
 * }
 * 
 * static void hello(String name, int age) {
 * System.out.println("Hello " + name);
 * System.out.println("You are " + age + " years old");
 * }
 * 
 * }
 * 
 */


// methods => a method is a block of code that is executed whenever it is called upon
// if you want to pass a value or variable to a method call that method with in the paranthasis
//  the values or variables that you are sending to a method known as "arguments".