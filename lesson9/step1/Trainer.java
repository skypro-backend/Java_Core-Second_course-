package lesson9.step1;

import lesson9.step1.animals.Pet;
import lesson9.step1.animals.Trained;

import java.util.*;

public class Trainer<A extends Pet & Trained> {
    private static Map<Trainer, Set<Trained>> trainedAnimals = new HashMap<>();

    public static String getTrainedAnimal() {
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<Trainer, Set<Trained>> entry : trainedAnimals.entrySet()) {
            builder.append(entry.getKey().getName()).append("-->");
            for (Trained animal : entry.getValue()) {
                if (animal instanceof Pet) {
                    builder.append(((Pet) animal).getName()).append(",");
                } else {
                    builder.append(",");
                }
            }
            builder.append("\n");
        }

        return builder.toString();
    }



    private String name;
    private String grade;

    public Trainer(String name) {
        this.name = name;
    }

    public void train(A pet) {
        System.out.println("Начинаю тренировку [" + pet.getName() + "]");

        for (String command : pet.getAllCommands()) {
            System.out.println("Обучаю команде " + command);
            pet.train(command);
        }

        System.out.println("Заканчиваю тренировку [" + pet.getName() + "]");

        Set<Trained> trained = trainedAnimals.getOrDefault(this, new HashSet<>());
        trained.add(pet);
        trainedAnimals.put(this, trained);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trainer<?> trainer = (Trainer<?>) o;
        return Objects.equals(name, trainer.name) && Objects.equals(grade, trainer.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
