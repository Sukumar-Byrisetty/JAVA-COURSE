
public class Printf {
    
    public static void main(String[] args) {
        
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        // System.out.printf("%b",myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // [width]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %10s", myString);

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        // System.out.printf("You have this much money %.3f ",myDouble);

        // [flags]
        // adds effect to output on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        // System.out.printf("You have this much money %-20f ", myDouble);
        // System.out.printf("You have this much money %+f ", myDouble);
        // System.out.printf("You have this much money %020f ", myDouble);
        System.out.printf("You have this much money %,f ", myDouble);
    }
}


// printf() => this is an optional method to control, format, and display text to the console window
//             two arguments = format string + (object/variable/value)
//             %[flags] [precision] [width] [conversion-character]