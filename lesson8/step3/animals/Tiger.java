package lesson8.step3.animals;

public class Tiger implements Trained {
    @Override
    public String[] getTrainedCommands() {
        return new String[0];
    }

    @Override
    public String[] getAllCommands() {
        return new String[0];
    }

    @Override
    public void train(String command) {
        System.out.println("Я дикий учиться не буду");
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Я никого не слушаюсь!");
    }
}
