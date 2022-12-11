package lesson6.step2;

import lesson6.step2.animals.*;
import lesson6.step2.exception.CantTalkException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Breed brShBreed = new Breed("British Shorthair", "GB", Breed.HairType.SHORT);
//
        Cat begemot = new Cat("Бегемот", 1);
        Cat murzik = new Cat("Мурзик", 5);
//        murzik.setName("");
//
        Dog sharik = new Dog("Шарик", 2005);
//        sharik.train(TrainedCommand.CMD_SIT);
//        sharik.train(TrainedCommand.CMD_FETCH);
//        sharik.doCommand(TrainedCommand.CMD_FETCH);
//
//        Tiger tiger = new Tiger();
//
//        System.out.println("sharik.getTrainedCommands() = " + Arrays.toString(sharik.getTrainedCommands()));
//
//        Trainer<Dog> alex = new Trainer<>("Alex");
//        alex.train(sharik);
//
//        Trainer<Cat> mike = new Trainer<>("Mike");
//        mike.train(murzik);
//
//        Trainer<Trained> bob = new Trainer<>("Bob");
//        bob.train(sharik);
//        bob.train(murzik);
//        bob.train(tiger);
//
//        System.out.println("sharik.getTrainedCommands() = " + Arrays.toString(sharik.getTrainedCommands()));
//
//        checkTrained(murzik, sharik, tiger);

        Fish nemo = new Fish("Nemo");
        talk(murzik, sharik, begemot);
    }

    public static void talk(Pet... pets) {
        for (Pet pet : pets) {
            try {
                pet.talk();
            } catch (CantTalkException e) {
                System.out.println("Произошла ошибка с животным " + e.getPet().getName());
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (TrainedCommand trainedCommand : animal.getTrainedCommands()) {
                animal.doCommand(trainedCommand);
            }
        }
    }
}