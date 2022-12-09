package lesson1.step2;

public class Cat {
    public String name;
    public int age;

    public Cat(String name) {
        this.name = name;
        age = 1;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня звут " + name);
        System.out.println("Мне " + age + " лет");
    }
}
