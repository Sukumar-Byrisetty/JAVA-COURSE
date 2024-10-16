
public class WrapperClasses {
    
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Sukku";

        if(e=="sukku") {
            System.out.println("This is true!");
        }
    }
}

// wrapper class => provides a way to use primitive data types as reference data types
//                  reference data types contain useful methods
//                  can be used with collections (ex.ArrayList)                    

// primitive      // wrapper
//----------      //----------
// boolean           Boolean
// char              Character
// int               Integer
// double            Double

// autoboxing => the automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper classes
// unboxing => the reverse of autoboxing. automatic conversion of wrapper class to primitive