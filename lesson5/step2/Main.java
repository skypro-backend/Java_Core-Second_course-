package lesson5.step2;

import lesson5.step2.animals.*;
import lesson5.step2.animals.Cat.Breed;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Breed brShBreed = new Cat.Breed("British Shorthair", "GB", Cat.Breed.HairType.SHORT);

        Cat murzik = new Cat("Мурзик", 5);
        Dog sharik = new Dog("Шарик", 2005);
        sharik.train(TrainedCommand.CMD_SIT);
        sharik.train(TrainedCommand.CMD_FETCH);
        sharik.doCommand(TrainedCommand.CMD_FETCH);

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

        checkTrained(murzik, sharik, tiger);
    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (TrainedCommand trainedCommand : animal.getTrainedCommands()) {
                animal.doCommand(trainedCommand);
            }
        }
    }
}