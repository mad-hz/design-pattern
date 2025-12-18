package chatbot;

import java.util.Scanner;
import command.*;

public class ChatbotApp {

    private boolean running = true;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot started. Type 'exit' to quit.");

        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine();

            Command command = getCommand(input);
            command.execute(input);
        }
    }

    public void stop() {
        running = false;
    }

    private Command getCommand(String input) {
        if ("help".equalsIgnoreCase(input)) {
            return new HelpCommand();
        }
        if ("exit".equalsIgnoreCase(input)) {
            return new ExitCommand(this);
        }
        return new ChatCommand();
    }
}
