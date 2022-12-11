package lesson9.step1.exception;

import lesson9.step1.animals.Pet;

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
