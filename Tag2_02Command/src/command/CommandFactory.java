package command;

public class CommandFactory {

    private static final String PREFIX = "command.";
    private static final String SUFFFIX = "Command";


    public static Command getCommand(String zeile) {

        try {
            String [] tokens = zeile.split(" ");
            Command command = (Command) Class
                    .forName(PREFIX + tokens[0]+SUFFFIX)
                    .getConstructor()
                    .newInstance();

            command.parse(tokens);


            return command;
        } catch (Throwable t) {
            System.out.println("Unbekannter Befehl: " + t.getMessage());
            return null;
        }


    }
}
