package lesson9.step1;

import lesson9.step1.animals.Pet;

import java.util.LinkedList;
import java.util.Queue;

public class Veterinarian<T extends Pet> {
    private String name;
    private String speciality;
    private final Queue<T> queue = new LinkedList<>();

    public Veterinarian(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public void addPatient(T patient) {
        queue.offer(patient);
    }

    public void treat() {
        T pet = queue.poll();
        if (pet != null) {
            System.out.println("Доктор " + name + " лечит животное " + pet.getName());
            treat();
        } else {
            System.out.println("В очереди больше никого нет");
        }
    }

    public int queueSize() {
        return queue.size();
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }
}
