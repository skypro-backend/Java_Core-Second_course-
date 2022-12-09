package lesson3.step3;

import lesson3.step3.animals.*;
import lesson3.step3.animals.Cat.Breed;

public class Main {

    public static void main(String[] args) {
        Breed brShHair = new Breed("British Shorthair", "GB", "short");

        Cat murzik = new Cat("Мурзик", 3);
        murzik.setBreed(brShHair);

        Cat.FavToy murzikToy = murzik.new FavToy("Рыбка", "заводная");
        murzik.setToy(murzikToy);

        System.out.println("Игрушка " + murzikToy.getName() + ", нравится коту " + murzikToy.getCatName());


        Dog sharik = new Dog("Шарик");
        sharik.eat();

        Parrot kesha = new Parrot("Кеша");
        kesha.eat();

        Hamster hamster = new Hamster("Хомяк");
        hamster.eat();


        Cat begemot = new Cat("Бегемот", 5);
        Hack hack = new Hack("Test");

        murzik.addFriends(sharik);
        murzik.addFriends(begemot);
        murzik.addFriends(kesha);
        murzik.addFriends(hamster);
//        murzik.addFriends(hack);

        for (Pet friend : murzik.getFriends()) {
            System.out.println("Друг мурзика - " + friend.getName());
//            System.out.println("Друг мурзика - " + friend.getName().toUpperCase());
        }
    }
}