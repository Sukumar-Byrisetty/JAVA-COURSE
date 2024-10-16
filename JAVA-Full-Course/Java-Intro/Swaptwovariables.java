public class Swaptwovariables {

    public static void main(String[] args) {

        String x = "water";
        String y = "coke";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}

// in the above we have two variables. if you need to swap them you want to take
// another variable called temp.
// temp means temporarly stroed we can create manually