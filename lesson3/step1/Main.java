package lesson3.step1;

import lesson3.step1.animals.Cat;
import lesson3.step1.animals.Cat.Breed;
import lesson3.step1.animals.Dog;
import lesson3.step1.animals.Hamster;
import lesson3.step1.animals.Parrot;

public class Main {

    public static void main(String[] args) {
        Breed brShHair = new Breed("British Shorthair", "GB", "short");

        Cat murzik = new Cat("Мурзик", 1);
        murzik.setBreed(brShHair);

        Cat.FavToy murzikToy = murzik.new FavToy("Рыбка", "заводная");
        murzik.setToy(murzikToy);

        System.out.println("Игрушка " + murzikToy.getName() + ", нравится коту " + murzikToy.getCatName());

        murzik.talk();

        Dog sharik = new Dog("Шарик");
        sharik.talk();

        Parrot kesha = new Parrot("Кеша");
        kesha.talk();

        Hamster hamster = new Hamster("Хомяк");
        hamster.talk();
    }
}