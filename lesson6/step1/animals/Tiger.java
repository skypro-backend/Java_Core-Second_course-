package lesson6.step1.animals;

public class Tiger implements Trained {
    @Override
    public TrainedCommand[] getTrainedCommands() {
        return new TrainedCommand[0];
    }

    @Override
    public TrainedCommand[] getAllCommands() {
        return new TrainedCommand[0];
    }

    @Override
    public void train(TrainedCommand command) {
        System.out.println("Я дикий учиться не буду");
    }

    @Override
    public void doCommand(TrainedCommand command) {
        System.out.println("Я никого не слушаюсь!");
    }
}
