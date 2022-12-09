package lesson1.step3;

public class Cat {
    public String name;
    public int age;

    public Cat(String name) {
        this.name = name;
        age = 1;
    }

    public Cat(int age) {
        this.name = "Кот";
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;

        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня звут " + name);
        System.out.println("Мне " + age + " лет");
    }
}
