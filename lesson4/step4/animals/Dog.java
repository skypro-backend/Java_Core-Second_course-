package lesson4.step4.animals;

public class Dog extends Pet implements Trained {
    public static final String CMD_SIT = "Сидеть";
    public static final String CMD_VOICE = "Голос";
    public static final String CMD_FETCH = "Аппорт";

    private static final String[] ALL_COMMANDS = {CMD_SIT, CMD_VOICE, CMD_FETCH};

    private String[] trainedCommands = new String[ALL_COMMANDS.length];

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
        return trainedCommands;
    }

    @Override
    public String[] getAllCommands() {
        return ALL_COMMANDS;
    }

    @Override
    public void train(String command) {
        for (int i = 0; i < trainedCommands.length; i++) {
            boolean isEmpty = trainedCommands[i] == null;

            if (!isEmpty && trainedCommands[i].equals(command)) {
                break;
            }

            if (isEmpty) {
                trainedCommands[i] = command;
                break;
            }
        }
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Выполняю команду " + command);

        switch (command) {
            case CMD_SIT:
                System.out.println("Собака содится на пол");
                break;
            case CMD_VOICE:
                talk();
                break;
            case CMD_FETCH:
                System.out.println("Собака побежала за палкой");
                System.out.println("Собака принесла палку");
                break;
            default:
                System.out.println("Нет такой команды!");
        }
    }
}
