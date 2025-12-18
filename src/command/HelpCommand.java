package command;

public class HelpCommand implements Command {

    @Override
    public void execute(String input) {
        System.out.println("Chatbot: Available commands are help and exit.");
    }
}
