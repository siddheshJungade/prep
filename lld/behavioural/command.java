// this is Receiver 
public class AirConditioner {
    boolean isOn;
    int temperature;
    public AirConditioner() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Air conditioner is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Air conditioner is off");
    }

    public int setTemperature(int temp) {
        this.temperature = temp;
    }
}

// this is command
public interface Command {
    void execute();
    void undo();
}

public class TurnACOnCommand implements Command {
    AirConditioner airConditioner;

    public TurnACOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }

    @Override
    public void undo() {
        airConditioner.turnOff();
    }
}

public class TurnACOffCommand implements Command {
    AirConditioner airConditioner;

    public TurnACOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }

    @Override
    public void undo() {
        airConditioner.turnOn();
    }
}

// this is invoker
public class RemoteControl {

    Command command;
    Stack<Command> commandStack = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandStack.add(command);
    }

    public void pressUndo() {
        if (!commandStack.isEmpty()) {
            Command command = commandStack.pop();
            command.undo();
        } 
    }


}
// this is client
public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();
        Command turnACOnCommand = new TurnACOnCommand(airConditioner);
        Command turnACOffCommand = new TurnACOffCommand(airConditioner);
        remoteControl.setCommand(turnACOnCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(turnACOffCommand);
        remoteControl.pressButton();
    }
}