package MethodOverriding;

public class MethodOverriding {

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
    }
}

// method overriding => declaring a method in sub class, 
//                      which is already present in parent class
//                      done so that a child class can give its own implementation.
