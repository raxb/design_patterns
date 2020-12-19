package learn.patterns.command;

public interface Command {
    void execute();

    void undo();
}
