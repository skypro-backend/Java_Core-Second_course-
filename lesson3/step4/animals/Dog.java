package lesson3.step4.animals;

public class Dog extends Pet {
    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Насыпают собачий корм в миску");
        System.out.println("Дают команду");
        System.out.println("Ем корм");
        System.out.println("Пью воду");
    }

    @Override
    public String toString() {
        return "Dog Name " + getName();
    }
}
