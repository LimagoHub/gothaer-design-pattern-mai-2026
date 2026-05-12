package command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CommandHistory {


    private final Deque<Command> undoStack = new ArrayDeque<Command>();
    private final Deque<Command> redoStack = new ArrayDeque<Command>();

    public void addCommand(Command command) {
        if(command.isQuery()) return;
        redoStack.clear();
        undoStack.push(command);
    }

    public void undo() {
        if(undoStack.isEmpty())
            System.out.println("Can't Undo");
        else {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo() {
        if(redoStack.isEmpty())
            System.out.println("Can't Redo");
        else {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);

        }
    }
}
