
public class OverloadedMethods {
    
    public static void main(String[] args) {
        
        // int x = add(1,2); => this integer variable for 1st 3 methods

        double x = add(1.5, 2.5, 3.5, 4.5);

        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }

}

// overloaded methods = methods that share the same name but have different parameters
//                      method name + parameters = method signature
// here int is a return type.
// first 3 methods accept integers and they will accept 2 and 4 integers
// last 3 methods accept double and they will accept 2 and 4 double