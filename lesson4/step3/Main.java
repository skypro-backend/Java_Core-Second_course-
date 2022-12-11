package lesson4.step3;

import lesson4.step3.animals.*;

public class Main {

    public static void main(String[] args) {
        Dog sharik = new Dog("Шарик", 2005);
        Tiger tiger = new Tiger();

        sharik.train(Dog.CMD_FETCH);
        sharik.train(Dog.CMD_SIT);

        checkTrained(sharik, tiger);
    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (String trainedCommand : animal.getTrainedCommands()) {
                animal.doCommand(trainedCommand);
            }
        }
    }
}