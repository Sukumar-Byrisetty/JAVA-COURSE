package VariableScope;

import java.util.Random;

public class DiceRoller {

    // local variable eg :
    // DiceRoller() {
    // Random random = new Random();
    // int number = 0;
    // roll(random, number);
    // }

    // void roll(Random random, int number) {
    // number = random.nextInt(6)+1;
    // System.out.println(number);
    // }

    // global variable eg :

    Random random;
    int number; // here we declare inside diceroller class and out side of a method.

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}
