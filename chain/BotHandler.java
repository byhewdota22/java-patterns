package chain;

public class BotHandler extends SupportHandler {

    @Override
    protected boolean canHandle(String message) {
        String lower = message.toLowerCase();
        return lower.contains("пароль") || lower.contains("как");
    }

    @Override
    protected void handle(String message) {
        System.out.println("Запрос обработтал Бот");
    }
}