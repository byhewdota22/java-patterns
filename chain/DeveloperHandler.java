package chain;

public class DeveloperHandler extends SupportHandler {

    @Override
    protected boolean canHandle(String message) {
        String lower = message.toLowerCase();
        return lower.contains("баг") || lower.contains("ошибка");
    }

    @Override
    protected void handle(String message) {
        System.out.println("Разработчик решает ваш запрос ");
    }
}
