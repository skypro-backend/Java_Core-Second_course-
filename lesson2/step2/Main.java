package lesson2.step2;

import lesson2.step2.animals.Cat;

public class Main {

    public static void main(String[] args) {

        Cat murzik = new Cat("Мурзик", 1);
        murzik.meow();

        Cat begemot = new Cat("Бегемот", -5);
        begemot.setName(null);
        begemot.meow();

        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.addFriends(begemot);
        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.getFriends()[0].meow();
    }
}