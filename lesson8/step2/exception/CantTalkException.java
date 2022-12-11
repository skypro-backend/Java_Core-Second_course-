package lesson8.step2.exception;

import lesson8.step2.animals.Pet;

public class CantTalkException extends Exception {
    private final Pet pet;

    public CantTalkException(String message, Pet pet) {
        super(message);
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}
