package Encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        
        Car car = new Car("Maruti", "Suzuki", 2022);
        
        car.setYear(2024);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
    
}

// Encapsulation = attributes of a class will be hidden or private,
//                 can be accessed only methods (getters & setters)
//                 you should make attributes private if you don't have a reason to make them public/protected.