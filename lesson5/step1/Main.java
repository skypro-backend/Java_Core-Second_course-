package lesson5.step1;

import lesson5.step1.animals.Cat;
import lesson5.step1.animals.Dog;
import lesson5.step1.animals.Tiger;
import lesson5.step1.animals.Trained;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cat murzik = new Cat("Мурзик", 5);
        Dog sharik = new Dog("Шарик", 2005);
        sharik.train(Dog.TrainedCommand.CMD_SIT.name());
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
    }
}