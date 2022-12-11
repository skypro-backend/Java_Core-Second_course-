package lesson4.step4.animals;

public interface Trained {
    String[] getTrainedCommands();

    String[] getAllCommands();

    void train(String command);

    void doCommand(String command);
}
