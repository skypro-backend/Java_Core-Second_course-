package lesson9.step1;

import lesson9.step1.animals.Dog;
import lesson9.step1.animals.Trained;


public class Main {

    public static void main(String[] args) {
        Dog sharik = new Dog("Шарик", 2005);
        Dog tuzik = new Dog("Тузик", 2005);
        Dog ponchik = new Dog("Пончик", 2005);
        Dog qvadro = new Dog("Квадратик", 2005);


        Trainer<Dog> ivanTrainer = new Trainer<>("Ivan");
        ivanTrainer.train(tuzik);
        ivanTrainer.train(ponchik);

        Trainer<Dog> ivanTrainer2 = new Trainer<>("Ivan");
        ivanTrainer2.train(sharik);

        Trainer<Dog> olgaTrainer = new Trainer<>("Olga");
        olgaTrainer.train(sharik);
        olgaTrainer.train(qvadro);


//        checkTrained(sharik, sharik);

        System.out.println(Trainer.getTrainedAnimal());
    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (String trainedCommand : animal.getTrainedCommands()) {
                animal.doCommand(trainedCommand);
            }
        }
    }
}