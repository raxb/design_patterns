package learn.patterns.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    @Override
    public String toString() {
        StringBuilder remoteControls = new StringBuilder();
        remoteControls.append("----- REMOTE CONTROLS -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            remoteControls.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("  ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return remoteControls.toString();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasTriggered(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasTriggered(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoLastOperation() {
        undoCommand.undo();
    }

}
