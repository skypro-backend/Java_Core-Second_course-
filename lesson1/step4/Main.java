package lesson1.step4;

public class Main {

    public static void main(String[] args) {
        
        Cat murzik = new Cat("Мурзик");
        murzik.age = 1;
        murzik.meow();

        Cat begemot = new Cat("Бегемот", -5);
        begemot.meow();

        System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length + " друзей");
        murzik.addFriends(begemot);
        System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length + " друзей");
        murzik.friends[0].meow();
    }
}
