package lesson8.step2;

import lesson8.step2.animals.*;
import lesson8.step2.exception.CantTalkException;

public class Main {

    public static void main(String[] args) {
        Cat begemot = new Cat("Бегемот", 1);
        Cat murzik = new Cat("Мурзик", 5);
        Dog sharik = new Dog("Шарик", 2005);
        Dog cerber = new Dog("Цербер", 100500);
        Parrot kesha = new Parrot("Кеша", 2);
        Fish nemo = new Fish("Nemo");

        murzik.addFriends(begemot);
        murzik.addFriends(sharik);
        murzik.addFriends(kesha);
        murzik.addFriends(nemo);
        murzik.addFriends(new Dog("Шарик"));
        murzik.addFriends(new Dog("Шарик"));
        murzik.addFriends(new Dog("Шарик"));
        murzik.addFriends(new Dog("Шарик"));
        murzik.addFriends(new Dog("Шарик"));

        for (Pet friend : murzik.getFriends()) {
            System.out.println(friend.getName());
        }
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