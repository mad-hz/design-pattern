package command;

public class ChatCommand implements Command {

    @Override
    public void execute(String input) {
        System.out.println("Chatbot: I received your message.");
    }
}
