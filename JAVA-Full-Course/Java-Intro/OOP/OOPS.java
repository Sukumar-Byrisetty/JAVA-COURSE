package OOP;

public class OOPS {

    public static void main(String[] args) {
        
        Bike myBike1 = new Bike();
        Bike myBike2 = new Bike();

        System.out.println(myBike1.color);
        System.out.println(myBike1.price);
        System.out.println();
        System.out.println(myBike2.color);
        System.out.println(myBike2.price);

        myBike1.drive();
        myBike2.brake();

    }
}

// object => an instance of a class that may contain attributes and methods
// example : (phone, desk, computer, coffee cup)