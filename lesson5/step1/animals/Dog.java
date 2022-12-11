package lesson5.step1.animals;

public class Dog extends Pet implements Trained {
    public enum TrainedCommand {CMD_SIT, CMD_VOICE, CMD_FETCH, CMD_LITE_DOWN}

    private final TrainedCommand[] trainedCommands = new TrainedCommand[TrainedCommand.values().length];

    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Насыпают собачий корм в миску");
        System.out.println("Дают команду");
        System.out.println("Ем корм");
        System.out.println("Пью воду");
    }

    @Override
    public String toString() {
        return "Dog Name " + getName();
    }

    @Override
    public String[] getTrainedCommands() {
        String[] result = new String[trainedCommands.length];
        for (int i = 0; i < trainedCommands.length; i++) {
            if (null == trainedCommands[i]) {
                continue;
            }

            result[i] = trainedCommands[i].name();
        }
        return result;
    }

    @Override
    public String[] getAllCommands() {
        String[] result = new String[TrainedCommand.values().length];
        for (int i = 0; i < TrainedCommand.values().length; i++) {
            result[i] = TrainedCommand.values()[i].name();
        }
        return result;
    }

    @Override
    public void train(String command) {
        TrainedCommand trainedCommand = TrainedCommand.valueOf(command);
        for (int i = 0; i < trainedCommands.length; i++) {
            boolean isEmpty = trainedCommands[i] == null;

            if (!isEmpty && trainedCommands[i] == trainedCommand) {
                break;
            }

            if (isEmpty) {
                trainedCommands[i] = trainedCommand;
                break;
            }
        }
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Выполняю команду " + command);

        TrainedCommand trainedCommand = TrainedCommand.valueOf(command);

        switch (trainedCommand) {
            case CMD_SIT:
                System.out.println("Собака садится на пол");
                break;
            case CMD_VOICE:
                talk();
                break;
            case CMD_FETCH:
                System.out.println("Собака побежала за палкой");
                System.out.println("Собака принесла палку");
                break;
            case CMD_LITE_DOWN:
                System.out.println("Собака легла на пол");
            default:
                System.out.println("Нет такой команды!");
        }
    }
}
