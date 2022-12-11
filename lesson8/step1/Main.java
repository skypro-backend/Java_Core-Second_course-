package lesson8.step1;

import lesson8.step1.animals.*;
import lesson8.step1.exception.CantTalkException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Cat begemot = new Cat("Бегемот", 1);
        Cat murzik = new Cat("Мурзик", 5);
        Dog sharik = new Dog("Шарик", 2005);
        Dog cerber = new Dog("Цербер", 100500);
        Parrot kesha = new Parrot("Кеша", 2);
        Fish nemo = new Fish("Nemo");

        ArrayList<String> list = new ArrayList<>();
        list.add("Бегемот");
        list.add("Мурзик");
        list.add("Шарик");
        list.add("Цербер");
        list.add("Кеша");
        list.add("Nemo");
        list.add("Бегемот");

//        list.get(0)

        System.out.println(Arrays.toString(list.toArray()));

        Set<String> set = new HashSet<>();
        set.add("Бегемот");
        set.add("Мурзик");
        set.add("Шарик");
        set.add("Цербер");
        set.add("Кеша");
        set.add("Nemo");
        set.add("Бегемот");

        System.out.println(Arrays.toString(set.toArray()));
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