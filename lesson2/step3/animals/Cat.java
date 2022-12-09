package lesson2.step3.animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {
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
            return Cat.this.name;
        }
    }

    private FavToy toy;
    private String name;
    private int birthYear;
    private Cat[] friends;
    private Breed breed;

    public Cat(String name) {
        this(
            name,
            LocalDate.now()
                .getYear()
        );
    }

    public Cat(int birthYear) {
        this(
            "Кот",
            birthYear
        );
    }

    public Cat(
        String name,
        int age
    ) {
        this.name = name;

        if (age >= 0) {
            this.birthYear = LocalDate.now()
                .getYear() - age;
        } else {
            this.birthYear = LocalDate.now()
                .getYear() - Math.abs(age);
        }

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

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня звут " + name);
        System.out.println("Мне " + getAge() + " лет");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Кот";
        }
    }

    public int getAge() {
        return LocalDate.now()
            .getYear() - birthYear;
    }

    public FavToy getToy() {
        return toy;
    }

    public void setToy(FavToy toy) {
        this.toy = toy;
    }
}
