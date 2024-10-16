
public class IfStatements {

    public static void main(String[] args) {

        // if statement => if the condition is true the statement block will be executed
        // otherwise not execute.

        int age = 75;

        if (age >= 75) {
            System.out.println("Ok Boomer!");
        } 
        else if (age >= 18) {
            System.out.println("You are an adult!");
        } 
        else if (age >= 13) {
            System.out.println("You are a teenager!");
        } 
        else {
            System.out.println("You are not an adult!l");
        }
    }
}
