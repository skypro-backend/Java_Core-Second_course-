package lesson7.step1.animals;

import lesson7.step1.exception.CantTalkException;

public class Fish extends Pet {
    public Fish(String name) {
        super(name);
    }

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {}

    @Override
    public void talk() throws CantTalkException {
        throw new CantTalkException("Рыбы не умеют говорить", this);
    }
}
