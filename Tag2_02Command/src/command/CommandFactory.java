package command;

public class CommandFactory {

    public static Command getCommand(String zeile) {

        Command command = null;
        String [] tokens = zeile.split(" ");

        if(tokens[0].equals("Add")){
            command = new AddCommand();
            command.parse(tokens);
        }
        if(tokens[0].equals("Print")){
            command = new PrintCommand();
            command.parse(tokens);
        }

        return command;
    }
}
