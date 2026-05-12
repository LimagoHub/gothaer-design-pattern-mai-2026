package command;

public class CommandHistory {

    public void addCommand(Command command) {
        if(command.isQuery()) return;
        // Euer Kram
        // Command merken
        // redos leeren
    }

    public void undo() {
        System.out.println("Can't Undo");
    }

    public void redo() {
        System.out.println("Can't Redo");
    }
}
