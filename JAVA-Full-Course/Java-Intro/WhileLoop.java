import java.util.Scanner;

public class WhileLoop {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

    /*
       * Scanner scanner = new Scanner(System.in);
       * String name = "";
       * 
       * do
       * {
       * System.out.println("Enter your name: ");
       * name = scanner.nextLine();
       * }
       * while(name.isBlank());
       * 
       * System.out.println("Hello "+name);
    */
    
    } 
}

//WhileLoop => executes a block of code as long as a it's a condition remains true.