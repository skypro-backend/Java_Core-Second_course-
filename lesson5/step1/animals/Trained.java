package lesson5.step1.animals;

public interface Trained {
    String[] getTrainedCommands();

    String[] getAllCommands();

    void train(String command);

    void doCommand(String command);
}
