package lesson3.step2.animals;

import java.util.Arrays;

public class Cat extends Pet {
    private static int count;

    public static int getCount() {
        return count;
    }

    public static class Breed {
        private String name;
        private String country;
        private String hairType;

        public Breed(
            String name,
            String country,
            String heirType
        ) {
            this.name = name;
            this.country = country;
            this.hairType = heirType;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public String getHairType() {
            return hairType;
        }
    }

    public class FavToy {
        private String name;
        private String type;

        public FavToy(
            String name,
            String type
        ) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String getCatName() {
            return Cat.this.getName();
        }
    }

    private FavToy toy;
    private Cat[] friends;
    private Breed breed;

    public Cat(String name) {
        this(name, 0);
    }

    public Cat(int birthYear) {
        this("Кот", birthYear);
    }

    public Cat(String name, int age) {
       super(name, age);

        friends = new Cat[0];
        count++;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (this.breed == null) {
            this.breed = breed;
        }
    }

    public void talk() {
        System.out.println("Мяу!");
        System.out.println("Меня звут " + getName());
        System.out.println("Мне " + getAge() + " лет");
    }

    @Override
    public void eat() {
        System.out.println("Насыпают кошачий корм в миску");
        System.out.println("Ем корм");
        System.out.println("Пью воду");
    }

    public Cat[] getFriends() {
        if (friends == null) {
            friends = new Cat[0];
        }

        return friends;
    }

    public void addFriends(Cat friend) {
        this.friends = Arrays.copyOf(
            getFriends(),
            this.getFriends().length + 1
        );
        this.friends[this.friends.length - 1] = friend;
    }

    public FavToy getToy() {
        return toy;
    }

    public void setToy(FavToy toy) {
        this.toy = toy;
    }
}
