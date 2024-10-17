package Inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Car car = new Car();

        car.go();

        Bicycle bicycle = new Bicycle();

        bicycle.stop();

        System.out.println(car.doors);
        System.out.println(bicycle.pedals);
        
    } 
}
// Inheritance => the process where one class acquires,
//                the attributes and methods of another
// inheritance => one class attributes and methods will use another class (extends)