package lesson1.step2;

public class Main {
    public static void main(String[] args) {
        
        Cat murzik = new Cat("Мурзик");
        murzik.age = 3;
        murzik.meow();

        Cat begemot = new Cat("Бегемот", 5);
        begemot.meow();
    }
}
