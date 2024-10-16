package OOP;

public class Constructors {

    public static void main(String[] args) {

        Human human1 = new Human("will", 24, 65);
        Human human2 = new Human("jack", 25, 70);

        System.out.println(human1.name);
        System.out.println(human2.age);

        human1.eat();
        human2.drink();

    }
}

// constructor = special method that is called when an object is instantiated
// (created)
