package lesson2.step3;

import lesson2.step3.animals.Cat;
import lesson2.step3.animals.Cat.Breed;

public class Main {

    public static void main(String[] args) {
        Breed brShHair = new Breed("British Shorthair", "GB", "short");

        Cat murzik = new Cat("Мурзик", 1);
        murzik.setBreed(brShHair);

        Cat.FavToy murzikToy = murzik.new FavToy("Рыбка", "заводная");
        murzik.setToy(murzikToy);

        System.out.println("Игрушка " + murzikToy.getName() + ", нравится коту " + murzikToy.getCatName());

        murzik.meow();

        Cat begemot = new Cat("Бегемот", -5);
        begemot.setName(null);
        begemot.meow();

        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.addFriends(begemot);
        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.getFriends()[0].meow();

        System.out.println("Создано котов " + Cat.getCount());
    }
}