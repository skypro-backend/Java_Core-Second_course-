package lesson1.step4;

import java.util.Arrays;

public class Cat {
    public String name;
    public int age;
    public Cat[] friends;

    public Cat(String name) {
        this(name, 1);
    }

    public Cat(int age) {
        this("Кот", age);
    }

    public Cat(String name, int age) {
        this.name = name;

        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }

        friends = new Cat[0];
    }

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня звут " + name);
        System.out.println("Мне " + age + " лет");
    }

    public Cat[] getFriends() {
        if (friends == null) {
            friends = new Cat[0];
        }

        return friends;
    }

    public void addFriends(Cat friend) {
        this.friends = Arrays.copyOf(getFriends(), this.getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;
    }
}
