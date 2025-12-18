package command;

import chatbot.ChatbotApp;

public class ExitCommand implements Command {

    private ChatbotApp app;

    public ExitCommand(ChatbotApp app) {
        this.app = app;
    }

    @Override
    public void execute(String input) {
        System.out.println("Chatbot: Goodbye!");
        app.stop();
    }
}
