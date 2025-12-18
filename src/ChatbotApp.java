import java.util.Scanner;

public class ChatbotApp {

    private boolean running = true;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot started. Type 'exit' to quit.");

        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                stop();
            } else {
                System.out.println("Chatbot: I received your message.");
            }
        }
    }

    private void stop() {
        System.out.println("Chatbot: Goodbye!");
        running = false;
    }
}
