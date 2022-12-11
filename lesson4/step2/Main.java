package lesson4.step2;

import lesson4.step2.animals.Cat;
import lesson4.step2.animals.Dog;
import lesson4.step2.animals.Hamster;
import lesson4.step2.animals.Parrot;

public class Main {

    public static void main(String[] args) {

        Cat murzik = new Cat("Мурзик", 3);
//        murzik.eat();

        Dog sharik = new Dog("Шарик", 2005);
        Parrot kesha = new Parrot("Кеша");
        Hamster hamster = new Hamster("Хомяк");
        Cat begemot = new Cat("Бегемот", 5);

        murzik.addFriends(sharik);
        murzik.addFriends(hamster);
        murzik.addFriends(begemot);
        murzik.addFriends(kesha);
    }
}