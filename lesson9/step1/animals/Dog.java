package lesson9.step1.animals;

import lesson9.step1.exception.CantTalkException;

import java.util.HashSet;
import java.util.Set;

public class Dog extends Pet implements Trained {
    private final Set<TrainedCommand> trainedCommands = new HashSet<>();

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
        String[] result = new String[trainedCommands.size()];
        int i = 0;

        for (TrainedCommand trainedCommand : trainedCommands) {
            result[i] = trainedCommand.name();
            i++;
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
        trainedCommands.add(trainedCommand);
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Выполняю команду " + command);

        TrainedCommand trainedCommand = TrainedCommand.findByVoiceCommand(command);
        if (trainedCommand == null) {
            trainedCommand = TrainedCommand.valueOf(command);
        }
        switch (trainedCommand) {
            case CMD_SIT:
                System.out.println("Собака садится на пол");
                break;
            case CMD_VOICE:
                try {
                    talk();
                } catch (CantTalkException e) {
                    throw new RuntimeException(e);
                }
                break;
            case CMD_FETCH:
                System.out.println("Собака побежала за палкой");
                System.out.println("Собака принесла палку");
                break;
            case CMD_LITE_DOWN:
                System.out.println("Собака легла на пол");
                break;
            default:
                System.out.println("Нет такой команды!");
        }
    }
}
