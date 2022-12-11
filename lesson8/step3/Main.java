package lesson8.step3;

import lesson8.step3.animals.*;
import lesson8.step3.exception.CantTalkException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cat murzik = new Cat("Мурзик", 5);
        Dog sharik = new Dog("Шарик", 2005);
        Tiger tiger = new Tiger();

        System.out.println("sharik.getTrainedCommands() = " + Arrays.toString(sharik.getTrainedCommands()));

        Trainer<Dog> alex = new Trainer<>("Alex");
        alex.train(sharik);

        Trainer<Cat> mike = new Trainer<>("Mike");
        mike.train(murzik);

        Trainer<Trained> bob = new Trainer<>("Bob");
        bob.train(sharik);
        bob.train(murzik);
        bob.train(tiger);

        System.out.println("sharik.getTrainedCommands() = " + Arrays.toString(sharik.getTrainedCommands()));

        checkTrained(sharik, murzik, tiger);
    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (String trainedCommand : animal.getTrainedCommands()) {
                animal.doCommand(trainedCommand);
            }
        }
    }
}