package learn.patterns.command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        System.out.println(remoteControl);
        remoteControl.onButtonWasTriggered(0);
        remoteControl.onButtonWasTriggered(1);

        remoteControl.offButtonWasTriggered(0);
        remoteControl.offButtonWasTriggered(1);
        remoteControl.undoLastOperation();

        Command[] partyOn = {lightOnCommand, garageDoorOpenCommand};
        Command[] partyOff = {lightOffCommand, garageDoorCloseCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(2, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        remoteControl.onButtonWasTriggered(2);
        remoteControl.offButtonWasTriggered(2);
    }
}